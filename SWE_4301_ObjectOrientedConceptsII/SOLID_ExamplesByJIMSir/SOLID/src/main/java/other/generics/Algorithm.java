package other.generics;

import java.util.Collection;

/**
 * Created by jubair.
 * Date: 13/9/22
 * Time: 7:27 AM
 */

public class Algorithm {
    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {
        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }
}
