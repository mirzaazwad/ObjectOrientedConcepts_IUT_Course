package Lab08.SRP.Problem2;

public class Account {
    public String AccountID;
    private long balance;
    public Account(String AccountID,long balance){
        this.AccountID=AccountID;
        this.balance=balance;
    }

    public long getBalance(){
        return this.balance;
    }

    public void credit(long amount){
        this.balance-=amount;
    }

    public String update(){
        return "Update account";
    }

    public void debit(long amount){
        this.balance+=amount;
    }


}
