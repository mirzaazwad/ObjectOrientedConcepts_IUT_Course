package other.generics.lab6;

import other.generics.tasks.Element;

import java.util.Stack;

/**
 * Created by jubair.
 * Date: 19/9/22
 * Time: 8:01 PM
 */

public class GenericMaxStack<T extends Comparable<T> > {
    Stack<Element<T>> container;

    public GenericMaxStack(){
        this.container = new Stack<>();
    }

    public T getMax() {
        if (container.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        else{
            System.out.println("Max Element in the stack is: " + container.peek().maxValue);
            return container.peek().maxValue;
        }
    }

    public void pop() {
        if (container.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        container.pop();
        System.out.print("Top Most Element Removed: ");
    }

    public void push(T element) {
        if (container.isEmpty()) {
            container.push(new Element<>(element, element));
            return;
        }
        else {
            if (element.compareTo(container.peek().maxValue) > 0) {
                container.push(new Element<>(element, element));
            }
            else container.push(new Element<>(element, container.peek().maxValue));
        }
        System.out.println("Element " + element + " Inserted");
    }
}
