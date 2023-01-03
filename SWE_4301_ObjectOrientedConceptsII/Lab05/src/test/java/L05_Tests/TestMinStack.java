package L05_Tests;
import L05_Tasks.FizzyBuzz;
import L05_Tasks.MinStack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMinStack {
    @Test
    public void Test3251(){
        MinStack<Integer> min=new MinStack<Integer>();
        min.push(3);
        min.push(2);
        min.push(5);
        min.push(1);
        assertEquals(min.min(),1);
    }

    @Test
    public void Test3251Pop() throws Exception{
        MinStack<Integer> min=new MinStack<Integer>();
        min.push(3);
        min.push(2);
        min.push(5);
        min.push(1);
        min.pop();
        assertEquals(min.min(),2);
    }

    @Test
    public void Test1234Min(){
        MinStack<Integer> min=new MinStack<Integer>();
        min.push(12);
        min.push(3);
        min.push(4);
        assertEquals(min.min(),3);
    }

    @Test
    public void TestGenerics()throws Exception{
        MinStack<String> min=new MinStack<String>();

        min.push("12");
        min.push("3");
        min.push("4");
        min.push("3");
        min.pop();
        assertEquals(min.min(),"3");
    }

    @Test
    public void TestSameMinStack(){
        MinStack<Integer> min=new MinStack<Integer>();
        min.push(5);
        min.push(5);
        min.push(5);
        min.push(5);
        assertEquals(min.min(),5);
    }
}
