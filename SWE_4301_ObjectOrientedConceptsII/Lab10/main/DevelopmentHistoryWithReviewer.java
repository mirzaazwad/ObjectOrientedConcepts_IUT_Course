package Lab10;

import java.lang.annotation.*;

@Target({ElementType.CONSTRUCTOR,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DevelopmentHistoryWithReviewer{
    int version() default 1;
    String developer() default "";
    String tester() default "";
    String[] reviewers() default {};
}
