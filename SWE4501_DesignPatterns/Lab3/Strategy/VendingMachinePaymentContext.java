package Lab3.Strategy;

public class VendingMachinePaymentContext {
    private IPaymentStrategy strategy;
    public VendingMachinePaymentContext(IPaymentStrategy strategy){
        this.strategy=strategy;
    }

    public String executePayment(){
        return strategy.pay();
    }

}
