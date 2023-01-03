import SimpleGenericCalculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    @Test
    public void TestAdd(){
        Calculator calculator=new Calculator();
        assertEquals(calculator.add(2.3,3.1),5.4);
    }
    @Test
    public void TestSubtract(){
        Calculator calculator=new Calculator();
        assertEquals(calculator.subtract(3.1,2.1),1.0);
    }
    @Test
    public void TestMultiply(){
        Calculator calculator=new Calculator();
        assertEquals(calculator.multiply(2.0,2.0),4.0);
    }
    @Test
    public void TestDivide(){
        Calculator calculator=new Calculator();
        assertEquals(calculator.divide(3.0,2.0),1.5);
    }

}
