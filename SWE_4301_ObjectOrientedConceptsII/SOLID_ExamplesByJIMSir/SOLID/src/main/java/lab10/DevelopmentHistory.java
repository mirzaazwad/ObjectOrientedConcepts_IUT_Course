package lab10;

import java.lang.annotation.*;

/**
 * Created by jubair.
 * Date: 8/11/22
 * Time: 9:05 AM
 */

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DevelopmentHistory {
    int version() default 1;
    String developer();
    String tester() default "";
}
