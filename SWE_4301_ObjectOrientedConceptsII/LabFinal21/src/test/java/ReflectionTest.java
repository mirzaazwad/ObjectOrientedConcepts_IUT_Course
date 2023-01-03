import SOLID.Book;
import SOLID.KidsBook;
import SimpleGenericCalculator.Calculator;
import SimpleGenericCalculator.Operation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.*;
public class ReflectionTest {
    @Test
    public void TestBookSuper(){
        assertEquals(Book.class.getSuperclass().getSimpleName(),"Object");
    }

    @Deprecated
    @Test
    public void TestCalculator() throws IllegalAccessException,NoSuchMethodException,InvocationTargetException{
        boolean exceptionOccurs=true;
        try{
            Calculator.class.newInstance();
            exceptionOccurs=true;
        }
        catch (InstantiationException e){
            exceptionOccurs=false;
        }
        finally {
            assertTrue(exceptionOccurs && !Calculator.class.isInterface());
        }
    }

}
