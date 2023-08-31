package Lab3.Strategy;

public class Bkash implements IPaymentStrategy{
    private String phone;
    private String username;
    private Double amount;

    public Bkash(String phone,String username, Double amount){
        this.amount=amount;
        this.username=username;
        this.amount=amount;
    }

    @Override
    public String toString(){
        return this.phone+" by "+this.username+" of "+this.amount.toString();
    }
    public String pay(){
        return "Paying with Bkash from "+this.toString();
    }


}
