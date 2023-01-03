package other.annotations;

import java.lang.annotation.*;

/**
 * Created by jubair.
 * Date: 4/11/22
 * Time: 7:11 AM
 */

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Schedules.class)
public @interface Schedule {
    String time() default "09:00";
}
