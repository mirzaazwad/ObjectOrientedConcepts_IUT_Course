package lab9;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by jubair.
 * Date: 3/11/22
 * Time: 11:51 PM
 */

@Documented
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.PACKAGE})
public @interface ClassPreamble {
    String author() default "";
    String date();
    int currentVersion() default 1;
    String lastModified();
    String[] reviewers();
}
