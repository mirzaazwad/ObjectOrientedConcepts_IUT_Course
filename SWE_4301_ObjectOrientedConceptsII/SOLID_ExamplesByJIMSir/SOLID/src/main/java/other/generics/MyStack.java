package other.generics;

/**
 * Created by jubair.
 * Date: 12/9/22
 * Time: 11:27 PM
 */

// Java program to implement a stack that supports getMinimum() in O(1) time and O(1) extra space.
import java.util.*;

public class MyStack {
    private Stack<Integer> stack;
    private Integer minElement;

    public MyStack() {
        this.stack = new Stack<Integer>();
    }

    public int getMin() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            System.out.println("Minimum Element in the stack is: " + minElement);
            return minElement;
        }
    }

    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty ");
            return 0;
        }

        Integer top = stack.peek();
        System.out.print("Top Most Element is: ");

        // If top < minElement means minElement stores value of top.
        if (top < minElement) {
            System.out.println(minElement);
            return minElement;
        }
        else {
            System.out.println(top);
            return top;
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Most Element Removed: ");
        Integer top = stack.pop();

       if (top < minElement) {
            System.out.println(minElement);
           minElement = 2 * minElement - top;
        }
        else
            System.out.println(top);
    }

    public void push(Integer num) {
        if (stack.isEmpty()) {
            minElement = num;
            stack.push(num);
            System.out.println("Number Inserted: " + num);
            return;
        }

        // If new number is less than original minEle
        if (num < minElement) {
            stack.push(2*num - minElement);
            minElement = num;
        }
        else
            stack.push(num);

        System.out.println("Number Inserted: " + num);
    }

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }
}

