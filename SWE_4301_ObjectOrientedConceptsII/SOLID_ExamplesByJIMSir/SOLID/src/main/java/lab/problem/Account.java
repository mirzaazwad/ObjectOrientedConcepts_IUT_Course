package lab.problem;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jubair.
 * Date: 18/10/22
 * Time: 7:08 AM
 */

public class Account {
    private String accountId;
    private long balance;
    private Map<String, Account> accounts = new HashMap<>();

    public Account(String accountId, long initialBalance) {
        this.accountId = accountId; this.balance = initialBalance;
    }
    public void debit(long amount) {
        this.balance -= amount;
    }
    public void credit(long  amount) {
        this.balance += amount;
    }
    public long getBalance() {
        return this.balance;
    }

    public void addAccount(String userId, Account account){
        this.accounts.put(userId, account);
    }
    public Account findAccountForUser(String userId) {
        return this.accounts.get(userId);
    }

    public void updateAccount(Account account) {
        // nothing
    }

    public void transfer(String senderId, String beneficiaryId, long amount) {
        // logic
    }
}
