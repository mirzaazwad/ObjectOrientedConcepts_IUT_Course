package lab10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by jubair.
 * Date: 8/11/22
 * Time: 9:06 AM
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface DevelopmentHistoryWithReviewer {
    DevelopmentHistory devlopment();
    String[] reviewers();
}
