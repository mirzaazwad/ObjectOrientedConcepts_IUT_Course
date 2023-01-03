package lab10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by jubair.
 * Date: 10/11/22
 * Time: 10:56 AM
 */

@FunctionalInterface
public interface Adder {
    int add(int a, int b);
}
