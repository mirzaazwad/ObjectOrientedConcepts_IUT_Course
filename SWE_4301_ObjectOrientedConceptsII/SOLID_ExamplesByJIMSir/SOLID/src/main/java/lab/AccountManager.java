package lab;

/**
 * Created by jubair.
 * Date: 18/10/22
 * Time: 6:43 AM
 */

public interface AccountManager {
    Account findAccountForUser(String userId);
    void updateAccount(Account account);
}
