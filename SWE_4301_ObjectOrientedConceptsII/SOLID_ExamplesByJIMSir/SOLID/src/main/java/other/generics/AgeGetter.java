package other.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jubair.
 * Date: 23/9/22
 * Time: 11:43 AM
 */

public class AgeGetter {
    public int getAge(List<? extends Human> list){
//        list.

        return 1;
    }

    public static void main(String[] args) {
        AgeGetter ageGetter = new AgeGetter();
//        List<Human> list = new ArrayList<Person2>();
//        ageGetter.getAge(Arrays.asList(new Person2(23), new Helllo3(23)));
    }
}
