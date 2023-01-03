package other.generics.lab6;

/**
 * Created by jubair.
 * Date: 19/9/22
 * Time: 8:51 PM
 */

class OddPredicate implements UnaryPredicate<Integer> {
    public boolean test(Integer num) { return num % 2 != 0; }
}
