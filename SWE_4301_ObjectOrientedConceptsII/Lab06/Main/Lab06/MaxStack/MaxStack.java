package Lab06.MaxStack;

import java.util.ArrayList;
import java.util.Stack;
import java.util.*;

public class MaxStack<T extends Comparable<T>>{

    private Stack<T> stack;

    private Stack<T> Max;

    public MaxStack(){
        stack=new Stack<T>();
        Max=new Stack<T>();
    }

    public void push(T key){
        if(!Max.empty()){
            if(Max.peek().compareTo(key)==-1){
                Max.push(key);
            }
        }
        else{
            Max.push(key);
        }
        stack.push(key);
    }

    public void pop(){
        if(Max.peek().equals(stack.peek())){
            Max.pop();
        }
        stack.pop();
    }

    public T max(){
        return Max.peek();
    }

    public T top(){
        return stack.peek();
    }

}

