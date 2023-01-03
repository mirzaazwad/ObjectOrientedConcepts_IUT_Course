package other.generics.tasks;

/**
 * Created by jubair.
 * Date: 13/9/22
 * Time: 8:21 AM
 */

public class Element<T>{
    public T value;
    public T maxValue;

    public Element(T num, T num1){
        this.value = num;
        this.maxValue = num1;
    }
}
