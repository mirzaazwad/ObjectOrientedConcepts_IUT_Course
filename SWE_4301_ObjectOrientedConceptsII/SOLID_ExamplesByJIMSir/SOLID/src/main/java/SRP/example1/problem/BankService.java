package SRP.example1.problem;

/**
 * Created by jubair.
 * Date: 28/8/22
 * Time: 6:05 PM
 */

public class BankService {

    public long deposit(long amount, String accountNumber){
        // deposit amount   balance += amount
        return 0;
    }

    public long withdraw(long amount, String accountNumber){
        // withdraw amount if possible      balance -= amount
        return 0;
    }

    public void printPassbook(String accountNumber){
        // update transaction info in passbook
    }

    public void getLoanInterestInfo(String loanType){
        if(loanType.equals("homeLoan")){
            // implementation
        }
        if(loanType.equals("personalLoan")){
            // implementation
        }
        if(loanType.equals("car")){
            // implementation
        }
    }

    public void sendOTP(String medium){
        if(medium.equals("email")){
            // email related logic
        }
        if(medium.equals("mobile")){
            // mobile related logic
        }
    }
}
