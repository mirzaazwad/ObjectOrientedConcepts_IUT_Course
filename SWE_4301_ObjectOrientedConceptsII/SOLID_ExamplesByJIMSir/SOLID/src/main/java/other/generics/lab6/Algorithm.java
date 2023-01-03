package other.generics.lab6;

import java.util.List;

/**
 * Created by jubair.
 * Date: 19/9/22
 * Time: 8:34 PM
 */

public class Algorithm {
    public static <T> int countIf(List<T> c, UnaryPredicate<T> p) {
        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }

    public int count(List<Integer> list) {
        int count = 0;
        for (Integer elem : list)
            if (elem%3 == 0)
                ++count;
        return count;
    }
}
