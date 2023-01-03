package DIP.example1.solution;

/**
 * Created by jubair.
 * Date: 28/8/22
 * Time: 7:10 PM
 */

public class ShoppingMall {
    private BankCard bankCard;

    public ShoppingMall(BankCard card){
        this.bankCard = card;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(1000);

        bankCard = new CreditCard();
        ShoppingMall shoppingMall2 = new ShoppingMall(bankCard);
        shoppingMall2.doPurchaseSomething(5000);
    }
}
