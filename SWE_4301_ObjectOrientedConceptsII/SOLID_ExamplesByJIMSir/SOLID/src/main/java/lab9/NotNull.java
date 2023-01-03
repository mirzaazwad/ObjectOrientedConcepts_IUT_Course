package lab9;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by jubair.
 * Date: 3/11/22
 * Time: 11:28 PM
 */

@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@ClassPreamble(author = "jubair", date = "03/11/2022", currentVersion = 2, lastModified = "jubair", reviewers = {"ajaira", "manush"})
public @interface NotNull {
    String value() default "";
}

