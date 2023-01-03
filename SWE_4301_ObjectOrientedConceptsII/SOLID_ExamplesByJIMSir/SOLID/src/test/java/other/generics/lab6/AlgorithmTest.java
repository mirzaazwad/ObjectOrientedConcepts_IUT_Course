package other.generics.lab6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jubair.
 * Date: 19/9/22
 * Time: 8:53 PM
 */

class AlgorithmTest {

    @Test
    void countIfOdd() {
        List<Integer> ci = Arrays.asList(2, 3, 5, 6);
        int count = new Algorithm().count(ci);
        System.out.println("Number of odd integers = " + count);
        assertEquals(2, count);
    }

    @Test
    void countIfEven() {
        List<Integer> ci = Arrays.asList(2, 3, 16, 6);
        int count = Algorithm.countIf(ci, new EvenPredicate());
        System.out.println("Number of odd integers = " + count);
        assertEquals(3, count);
    }

    @Test
    void countIfPalindrome() {
        List<String> ci = Arrays.asList("Mom", "BOOB", "Hell");
        int count = Algorithm.countIf(ci, new PalindromePredicate());
        System.out.println("Number of odd integers = " + count);
        assertEquals(2, count);
    }

}