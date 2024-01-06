package kz.singularity.solidbankapp.DAO;

import kz.singularity.solidbankapp.model.Account;
import kz.singularity.solidbankapp.model.AccountType;
import kz.singularity.solidbankapp.model.AccountWithdraw;

import java.util.ArrayList;
import java.util.List;

public class MemoryAccountDao implements AccountDao{
    List<Account> accountList = new ArrayList<>();
    @Override
    public List<Account> getClientAccounts(String clientId) {
        return this.accountList = accountList;
    }

    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
        System.out.println("Bank account created successfully");
    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public List<Account> getClientAccountsByType(String clientId, AccountType accountType) {
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientId, String accountId) {
        return null;
    }

    @Override
    public Account getClientAccount(String clientId, String accountId) {
        return null;
    }
}
