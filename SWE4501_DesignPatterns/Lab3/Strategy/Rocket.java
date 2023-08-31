package Lab3.Strategy;

public class Rocket implements IPaymentStrategy{
    private String phone;
    private String username;
    private Double amount;

    public Rocket(String phone,String username, Double amount){
        this.amount=amount;
        this.username=username;
        this.amount=amount;
    }

    @Override
    public String toString(){
        return this.phone+" by "+this.username+" of "+this.amount.toString();
    }
    public String pay(){
        return "Paying with Rocket from "+this.toString();
    }
}
