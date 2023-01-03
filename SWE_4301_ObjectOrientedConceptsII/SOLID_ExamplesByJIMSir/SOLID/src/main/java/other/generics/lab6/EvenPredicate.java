package other.generics.lab6;

/**
 * Created by jubair.
 * Date: 19/9/22
 * Time: 8:55 PM
 */

public class EvenPredicate implements UnaryPredicate<Integer>{
    @Override
    public boolean test(Integer obj) {
        return obj%2 == 0;
    }
}
