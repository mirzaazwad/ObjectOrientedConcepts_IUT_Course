package other.generics.problems;

import java.util.List;

/**
 * Created by jubair.
 * Date: 3/11/22
 * Time: 11:14 AM
 */

public class GenericClass<T extends Comparable> {
    public <T> int compare(T a, T b){
//        a > b;
        T abc = null;
        return 0;
    }

    public int compare(int a, int b){
        return 0;
    }

    public <T> int count(List<T> list, IProperty<T> property) {
        Object abc;

        int count = 0;
        for (T elem : list)
            if (property.check(elem))
                ++count;
        return count;
    }
}
