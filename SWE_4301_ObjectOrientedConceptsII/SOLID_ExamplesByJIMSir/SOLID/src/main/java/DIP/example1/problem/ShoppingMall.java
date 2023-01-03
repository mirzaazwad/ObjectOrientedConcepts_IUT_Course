package DIP.example1.problem;

/**
 * Created by jubair.
 * Date: 28/8/22
 * Time: 7:03 PM
 */

public class ShoppingMall {
    private DebitCard debitCard;        // tightly coupled. if we want to use credit card?!!

    public ShoppingMall(DebitCard card){
        this.debitCard = card;
    }

    public void doPurchaseSomething(long amount){
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPurchaseSomething(1000);
    }
}
