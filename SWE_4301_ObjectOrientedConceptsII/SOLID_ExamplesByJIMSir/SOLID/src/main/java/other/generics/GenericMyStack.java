package other.generics;

import java.util.Stack;

/**
 * Created by jubair.
 * Date: 13/9/22
 * Time: 7:15 AM
 */

public class GenericMyStack<T extends Number & Comparable<T>> {
    private Stack<T> stack;
    private T minElement;

    public GenericMyStack() {
        this.stack = new Stack<>();
    }

    public T getMin() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        else{
            System.out.println("Minimum Element in the stack is: " + minElement);
            return minElement;
        }
    }

    public T peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty ");
            return null;
        }

        T top = stack.peek();
        System.out.print("Top Most Element is: ");

        // If top < minElement means minElement stores value of top.
        if (top.compareTo(minElement) < 0) {
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
        T top = stack.pop();

        if (top.compareTo(minElement) < 0) {
            System.out.println(minElement);
//            minElement = 2 * minElement - top;
        }
        else
            System.out.println(top);
    }

    public void push(T num) {
        if (stack.isEmpty()) {
            minElement = num;
            stack.push(num);
            System.out.println("Number Inserted: " + num);
            return;
        }

        // If new number is less than original minEle
        if (num.compareTo(minElement) < 0){
//            stack.push(2*num - minElement);
            stack.push(num);
            minElement = num;
        }
        else
            stack.push(num);

        System.out.println("Number Inserted: " + num);
    }

    public static void main(String[] args) {
        GenericMyStack<Integer> s = new GenericMyStack<>();
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


