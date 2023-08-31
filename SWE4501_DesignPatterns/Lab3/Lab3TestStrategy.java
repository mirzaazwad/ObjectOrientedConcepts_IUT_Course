package Lab3;

import Lab3.Strategy.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lab3TestStrategy {
    @Test
    public void testBkashPaymentStrategy(){
        VendingMachinePaymentContext vendingMachinePaymentContext=new VendingMachinePaymentContext(new Bkash("01991681338","Mirza Azwad",20.00));
        assertEquals("Paying with Bkash from null by Mirza Azwad of 20.0",vendingMachinePaymentContext.executePayment());

    }

    @Test
    public void testNagadPaymentStrategy(){
        VendingMachinePaymentContext vendingMachinePaymentContext=new VendingMachinePaymentContext(new Nagad("01991681338","Mirza Azwad",20.00));
        assertEquals("Paying with Nagad from null by Mirza Azwad of 20.0",vendingMachinePaymentContext.executePayment());
    }

    @Test
    public void testRocketPaymentStrategy(){
        VendingMachinePaymentContext vendingMachinePaymentContext=new VendingMachinePaymentContext(new Rocket("01991681338","Mirza Azwad",20.00));
        assertEquals("Paying with Rocket from null by Mirza Azwad of 20.0",vendingMachinePaymentContext.executePayment());
    }

    @Test
    public void testCashPaymentStrategy(){
        VendingMachinePaymentContext vendingMachinePaymentContext=new VendingMachinePaymentContext(new Cash(20.00));
        assertEquals("Paying with Cash of amount: 20.0",vendingMachinePaymentContext.executePayment());
    }

    @Test
    public void testCardPaymentStrategy(){
        VendingMachinePaymentContext vendingMachinePaymentContext=new VendingMachinePaymentContext(new Card("Mirza Azwad","4263982640269299","ABBank","VISA",20.00));
        assertEquals("Paying with Card from Mirza Azwad with card number: 4263982640269299 of type: VISA of bank: ABBank of amount: 20.0",vendingMachinePaymentContext.executePayment());
    }

}
