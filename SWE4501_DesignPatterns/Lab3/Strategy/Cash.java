package Lab3.Strategy;

public class Cash implements IPaymentStrategy{
    private Double amount;
    public Cash(Double amount){
        this.amount=amount;
    }
    public String pay(){
        return "Paying with Cash of amount: "+amount.toString();
    }
}
