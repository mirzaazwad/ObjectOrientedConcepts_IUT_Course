package other.generics.lab6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jubair.
 * Date: 19/9/22
 * Time: 8:12 PM
 */

class GenericMaxStackTest {

    @Test
    void getMaxInt() {
        GenericMaxStack<Integer> stack = new GenericMaxStack<>();
        stack.push(3);
        stack.push(5);
        stack.push(2);
        assertEquals(5, stack.getMax());
    }

    @Test
    void getMaxIntAfterPop() {
        GenericMaxStack<Integer> stack = new GenericMaxStack<>();
        stack.push(2);
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.pop();
        assertEquals(2, stack.getMax());
        stack.pop();
        assertEquals(2, stack.getMax());
    }

    @Test
    void getMaxString() {
        GenericMaxStack<String> stack = new GenericMaxStack<>();
        stack.push("OOC is bad");
        stack.push("Nothing to understand");
        stack.push("Try hard");
        assertEquals("Try hard", stack.getMax());
        stack.pop();
        assertEquals("OOC is bad", stack.getMax());
    }

}