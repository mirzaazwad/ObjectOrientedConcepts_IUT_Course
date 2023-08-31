package Lab3.Strategy;

public class Card implements IPaymentStrategy{
    private  String username;
    private String cardNumber;
    private String cardType;
    private String bank;
    private Double amount;
    public Card(String username,String cardNumber,String bank,String cardType,Double amount){
        this.username=username;
        this.cardNumber=cardNumber;
        this.bank=bank;
        this.amount=amount;
        this.cardType=cardType;

    }

    @Override
    public String toString(){
        return this.username+" with card number: "+this.cardNumber+" of type: "+this.cardType+" of bank: "+this.bank+" of amount: "+this.amount.toString();
    }
    public String pay(){
        return "Paying with Card from "+this.toString();
    }
}
