package L05_Tests;


import L05_Tasks.FizzyBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFizzBuzz {
    @Test
    public void TestFizz(){
        FizzyBuzz fizz=new FizzyBuzz();
        assertEquals("Fizz",fizz.getFizzyBuzz(3));
    }

    @Test
    public void TestBuzz(){
        FizzyBuzz fizz=new FizzyBuzz();
        assertEquals("Buzz",fizz.getFizzyBuzz(7));
    }

    @Test
    public void TestGotcha(){
        FizzyBuzz fizz=new FizzyBuzz();
        assertEquals("Gotcha",fizz.getFizzyBuzz(11));
    }

    @Test
    public void TestFizzBuzz(){
        FizzyBuzz fizz=new FizzyBuzz();
        assertEquals("Fizzbuzz",fizz.getFizzyBuzz(21));
    }
}
