package other.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by jubair.
 * Date: 4/11/22
 * Time: 7:16 AM
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Schedules {
    Schedule[] value();
}
