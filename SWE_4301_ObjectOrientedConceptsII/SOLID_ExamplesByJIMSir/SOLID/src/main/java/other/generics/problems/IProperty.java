package other.generics.problems;

/**
 * Created by jubair.
 * Date: 3/11/22
 * Time: 11:24 AM
 */

public interface IProperty<T> {
    boolean check(T data);

    default void print(){
        System.out.println("something");
    }
}
