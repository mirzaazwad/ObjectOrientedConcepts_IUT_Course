package other.collections;

import java.util.*;

/**
 * Created by jubair.
 * Date: 6/11/22
 * Time: 6:23 PM
 */

    public class CollectionTry {
        public static void main(String[] args) {
            float[] arr = new float[6];
            Arrays.fill(arr, 5);
            System.out.println(arr.toString());

            List<String> cities = Arrays.asList("Dhaka", "Barishal", "Gazipur", "Dhaka");
            for (String city :
                    cities) {
                if (city.equals("Dhaka")) {
                    cities.add("Khulna");
                }
            }
            System.out.println(cities);
        }
    }
