package other.generics.problems;

/**
 * Created by jubair.
 * Date: 3/11/22
 * Time: 11:26 AM
 */

public class PalindromeChecker implements IProperty<String>{
    @Override
    public boolean check(String data) {
        boolean palindrome = true;
        for (int i = 0; i<data.length()/2; i++){
            if(data.charAt(i) == data.charAt(data.length()-i-1));
            else palindrome = false;
        }
        return palindrome;
    }
}
