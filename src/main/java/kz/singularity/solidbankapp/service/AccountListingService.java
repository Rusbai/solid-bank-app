package kz.singularity.solidbankapp.service;

import kz.singularity.solidbankapp.model.Account;
import kz.singularity.solidbankapp.model.AccountType;
import kz.singularity.solidbankapp.model.AccountWithdraw;

import java.util.List;

public interface AccountListingService {
    Account getClientAccounts(String clientId, String accountId);
    AccountWithdraw getClientWithdrawAccount(String clientId, String accountId);
    List<Account> getClientAccounts(String clientId);
    List<Account> getClientAccountsByType(String clientId, AccountType accountType);
}
