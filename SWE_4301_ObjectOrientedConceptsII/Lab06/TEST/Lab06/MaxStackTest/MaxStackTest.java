package Lab06.MaxStackTest;
import Lab06.MaxStack.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxStackTest {
    @Test
    public void Test3251(){
        MaxStack<Integer> max=new MaxStack<Integer>();
        max.push(3);
        max.push(2);
        max.push(5);
        max.push(1);
        assertEquals(max.max(),5);
    }

    @Test
    public void Test3251Pop() throws Exception{
        MaxStack<Integer> max=new MaxStack<Integer>();
        max.push(6);
        max.push(2);
        max.push(5);
        max.push(1);
        max.pop();
        assertEquals(max.max(),6);
    }

    @Test
    public void Test1234max(){
        MaxStack<Integer> max=new MaxStack<Integer>();
        max.push(12);
        max.push(3);
        max.push(4);
        assertEquals(max.max(),12);
    }

    @Test
    public void TestGenerics()throws Exception{
        MaxStack<String> max=new MaxStack<String>();

        max.push("12");
        max.push("3");
        max.push("4");
        max.push("3");
        max.pop();
        assertEquals(max.max(),"12");
    }

    @Test
    public void TestSameMaxStack(){
        MaxStack<Integer> max=new MaxStack<Integer>();
        max.push(5);
        max.push(5);
        max.push(5);
        max.push(5);
        assertEquals(max.max(),5);
    }
}
