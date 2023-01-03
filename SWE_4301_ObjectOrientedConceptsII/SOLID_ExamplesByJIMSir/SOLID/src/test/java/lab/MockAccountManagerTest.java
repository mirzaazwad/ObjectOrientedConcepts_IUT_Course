package lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jubair.
 * Date: 18/10/22
 * Time: 6:49 AM
 */

class MockAccountManagerTest {
    @Test
    public void testTransferOk(){
        MockAccountManager mockAccountManager = new MockAccountManager();

        Account sender = new Account("1", 200);
        Account beneficiary = new Account("2", 100);
        mockAccountManager.addAccount("1", sender);
        mockAccountManager.addAccount("2", beneficiary);

        AccountService accountService = new AccountService();
        accountService.setAccountManager(mockAccountManager);
        accountService.transfer("1", "2", 50);

        assertEquals(150, sender.getBalance());
        assertEquals(150, beneficiary.getBalance());
    }
}