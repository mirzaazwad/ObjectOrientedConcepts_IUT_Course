package other.annotations;

import java.lang.annotation.*;

/**
 * Created by jubair.
 * Date: 4/11/22
 * Time: 10:09 AM
 */

@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
//@Retention(RetentionPolicy.RUNTIME)
public @interface Description {
    String author();
    int currentVersion();
    String[] reviewers();
}
