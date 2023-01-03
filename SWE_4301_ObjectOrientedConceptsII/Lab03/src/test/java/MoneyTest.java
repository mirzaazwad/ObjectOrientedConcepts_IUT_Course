import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    public void testMultiplication(){
        Franc five=new Franc(5);
        Franc product=five.times(2);
        assertEquals(10,product.getAmount());
    }

    @Test
    public void testEquals(){
        assertEquals(new Franc(10),new Franc(10));
         assertTrue(new Franc(10).equals(new Franc(10)));
        assertFalse(new Franc(10).equals(new Franc(5)));
    }

    @Test
    public void testCurrencyTypeEquals(){

        assertEquals(new Franc(10),new Dollar(10));
    }

    @Test
    public void currencyEquals(){
        assertEquals(new Franc(10),new Franc(10));
    }
}
