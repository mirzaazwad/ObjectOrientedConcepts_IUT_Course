package other.generics.lab6;

/**
 * Created by jubair.
 * Date: 20/9/22
 * Time: 9:49 PM
 */

public class PalindromePredicate implements UnaryPredicate<String>{
    @Override
    public boolean test(String obj) {
        return obj.equalsIgnoreCase(new StringBuilder(obj).reverse().toString());
    }
}
