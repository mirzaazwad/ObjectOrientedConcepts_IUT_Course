package L05_Tasks;

import java.util.ArrayList;
import java.util.Stack;

public class MinStack<T> {
    private int top;
    private ArrayList<T> stack;

    private Stack<T> Min;

    public MinStack(){
        stack=new ArrayList<T>();
        top=-1;
        Min=new Stack<T>();
    }

    public void push(T value){
        if(Min.empty()){
            Min.push(value);
        }
        else if(Min.peek().hashCode()>=value.hashCode()){
            Min.push(value);
        }
        stack.add(value);
        top++;
   }

    public T pop() throws Exception{
        if(top==0){
            throw new Exception("Stack is empty");
        }
        if((stack.get(top).equals(Min.peek()))){
            Min.pop();
        }
        top--;
        return stack.get(top);
    }



    public T min(){
        return Min.peek();
    }
}
