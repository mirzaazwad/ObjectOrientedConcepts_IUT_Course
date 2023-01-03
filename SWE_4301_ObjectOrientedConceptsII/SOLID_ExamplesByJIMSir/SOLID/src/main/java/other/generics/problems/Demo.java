package other.generics.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jubair.
 * Date: 3/11/22
 * Time: 11:41 AM
 */

public class Demo {
    List<Double> doubleList;

    public Demo(){
        doubleList = new ArrayList<>();
    }
    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean palindrome = palindromeChecker.check("ABA");
        System.out.println( (palindrome ? "Palindrome" : "Not palindrome"));

        GenericClass genericClass = new GenericClass();
        List<Integer> oddList = new ArrayList<>();
        oddList.add(2);
        oddList.add(3);
        oddList.add(5);

        List<String> palindromeList = new ArrayList<>();
        palindromeList.add("AAA");
        palindromeList.add("BBAS");

        IProperty<String> ip = new PalindromeChecker();

        genericClass.count(palindromeList, ip);
    }
}
