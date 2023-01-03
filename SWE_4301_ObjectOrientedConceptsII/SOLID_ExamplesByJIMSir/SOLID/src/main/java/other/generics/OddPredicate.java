package other.generics;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by jubair.
 * Date: 13/9/22
 * Time: 7:28 AM
 */

public class OddPredicate implements UnaryPredicate<Integer>{
    @Override
    public boolean test(Integer obj) {
        return obj % 2 != 0;
    }

    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = Algorithm.countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }
}
