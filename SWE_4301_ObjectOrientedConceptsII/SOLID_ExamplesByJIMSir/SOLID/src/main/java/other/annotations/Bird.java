package other.annotations;

import lab9.NotNull;

import java.util.*;

/**
 * Created by jubair.
 * Date: 5/11/22
 * Time: 7:35 PM
 */

public class Bird extends Animal{
    String name;

    @Override
    public void sayWhatDoYouWant() {
        System.out.println("I want to fly");
    }

    public void birdListWithColor(){
//        Map<String, String> birdMap = new HashMap<>();
        Map birdMap = new HashMap();
        birdMap.put("Parrot", "Green");
        birdMap.put("Crow", "Black");

        birdMap.forEach( (k,v) -> System.out.println(k.toString() + " " + v.toString()));

    }

    private void printString(String test1, String test2) {
        System.out.println(test1);
        System.out.println(test2);
    }

    private void printStringVarargs(String... tests) {
        for (String test : tests) {
            System.out.println(test);
        }
    }

    @SafeVarargs

    private void printStringSafeVarargs(List<String>... testStringLists) {
        for (List<String> testStringList : testStringLists) {
            for (String testString : testStringList) {
                System.out.println(testString);
            }
        }
    }

    public static void main(String[] args) {
        Bird test = new Bird();
        Collections.singletonList(args);

        test.printString("String1", "String2");

        test.printStringVarargs("String1", "String2");

        List<String> testStringList1 = Arrays.asList("One", "Two");
        List<String> testStringList2 = Arrays.asList("Three", "Four");

        test.printStringSafeVarargs(testStringList1, testStringList2);
    }
}
