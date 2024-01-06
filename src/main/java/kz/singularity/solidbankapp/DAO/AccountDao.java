package kz.singularity.solidbankapp.DAO;

import kz.singularity.solidbankapp.model.Account;
import kz.singularity.solidbankapp.model.AccountDeposit;
import kz.singularity.solidbankapp.model.AccountType;
import kz.singularity.solidbankapp.model.AccountWithdraw;

import java.util.List;

public interface AccountDao {
    List<Account> getClientAccounts(String clientId);
    void createNewAccount(Account account);
    void updateAccount(Account account);
    List<Account> getClientAccountsByType(String clientId, AccountType accountType);
    AccountWithdraw getClientWithdrawAccount(String clientId, String accountId);
    Account getClientAccount(String clientId, String accountId);
}
