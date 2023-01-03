package other.generics.tasks;

import java.util.Stack;

/**
 * Created by jubair.
 * Date: 13/9/22
 * Time: 8:23 AM
 */

public class GenStack<T extends Comparable<T>> {
    Stack<Element<T>> container;
    T minElement;

    public GenStack(){
        this.container = new Stack<>();
    }

    public T getMin() {
        if (container.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        else{
            System.out.println("Minimum Element in the stack is: " + minElement);
            return minElement;
        }
    }

    public T peek() {
        if (container.isEmpty()) {
            System.out.println("Stack is empty ");
            return null;
        }

        T top = container.peek().maxValue;
        System.out.print("Top Most Element is: ");

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
        if (container.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Most Element Removed: ");
        T top = container.pop().maxValue;

        if (top.compareTo(minElement) < 0) {
            System.out.println(minElement);
//            minElement = 2 * minElement - top;
        }
        else
            System.out.println(top);
    }

    public void push(T num) {
        if (container.isEmpty()) {
            minElement = num;
            container.push(new Element<>(num, num));
            System.out.println("Number Inserted: " + num);
            return;
        }

        // If new number is less than original minEle
        if (num.compareTo(minElement) < 0){
//            stack.push(2*num - minElement);
            container.push(new Element<>(num, num));
            minElement = num;
        }
        else
            container.push(new Element<>(num, num));

        System.out.println("Number Inserted: " + num);
    }
}
