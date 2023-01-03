package Lab08.SRP.Problem2;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    public HashMap<String,Account> account;

    public Bank(){

    }

    public void addAccount(Account accountToBeAdded){
        account.put(accountToBeAdded.AccountID,accountToBeAdded);
    }

    public Account findAccountForUser(String AccountID){
        return account.get(AccountID);
    }

    public void updateAccount(Account accountToUpdate){
        Account tempAccount=account.get(accountToUpdate.AccountID);
        tempAccount.update(); //update operations performed on accountToUpdate
        //replace accountID from accountToUpdate with the updates in the accounts map
        account.replace(accountToUpdate.AccountID,tempAccount);
    }

    public void transfer(String senderID,String receiverID,long amount){
        Account sender=account.get(senderID);
        Account receiver=account.get(receiverID);
        sender.credit(amount);
        receiver.debit(amount);
        account.replace(senderID,sender);
        account.replace(receiverID,receiver);
    }

}
