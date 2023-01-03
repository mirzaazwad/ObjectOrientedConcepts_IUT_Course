package other.generics.lab6;

/**
 * Created by jubair.
 * Date: 20/9/22
 * Time: 7:41 AM
 */

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
