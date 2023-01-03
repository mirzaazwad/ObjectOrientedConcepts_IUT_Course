package Lab06.GenericCountTest;
import Lab06.GenericCount.*;
import Lab06.GenericCount.Algorithm;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class GenericCountTest {
    @Test
    public void TestDivisibleBy3(){
        ArrayList<Integer>array=new ArrayList<Integer>();
        array.add(2);
        array.add(3);
        array.add(5);
        array.add(6);
        Algorithm algo=new Algorithm();
        assertEquals(algo.countif(array,new DivisibleBy3()),2);
    }

    @Test
    public void TestOddNumber(){
        ArrayList<Integer>array=new ArrayList<Integer>();
        array.add(2);
        array.add(3);
        array.add(16);
        array.add(6);
        Algorithm algo=new Algorithm();
        assertEquals(algo.countif(array,new OddNumber()),1);
    }

    @Test
    public void TestString(){
        ArrayList<String>array=new ArrayList<String>();
        array.add("Alice");
        array.add("Bob");
        array.add("Beautiful");
        Algorithm algo=new Algorithm();
        assertEquals(algo.countif(array,new LengthGreaterThan3()),2);
    }

}
