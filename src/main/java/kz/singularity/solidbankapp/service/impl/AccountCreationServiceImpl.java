package kz.singularity.solidbankapp.service.impl;

import kz.singularity.solidbankapp.DAO.AccountDao;
import kz.singularity.solidbankapp.model.*;
import kz.singularity.solidbankapp.service.AccountCreationService;

public class AccountCreationServiceImpl implements AccountCreationService {
    AccountDao accountDao;
    public AccountCreationServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    @Override
    public void create(AccountType accountType, long bankId, String clientId, String accountId) {
        switch (accountType) {
            case CHECKING -> accountDao.createNewAccount(new CheckingAccount(accountType, accountId, clientId, 0.0, true));
            case SAVING -> accountDao.createNewAccount(new SavingAccount(accountType, accountId, clientId, 0.0, true));
            case FIXED -> accountDao.createNewAccount(new FixedAccount(accountType, accountId, clientId, 0.0, false));
            default -> System.out.println("wrong input");
        }
    }
}
