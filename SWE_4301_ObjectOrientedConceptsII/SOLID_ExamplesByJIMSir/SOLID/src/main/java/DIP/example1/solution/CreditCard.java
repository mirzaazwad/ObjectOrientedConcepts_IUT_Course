package DIP.example1.solution;

/**
 * Created by jubair.
 * Date: 28/8/22
 * Time: 7:09 PM
 */

public class CreditCard implements BankCard{
    @Override
    public void doTransaction(long amount) {
        System.out.println("Payment using Credit card");
    }
}
