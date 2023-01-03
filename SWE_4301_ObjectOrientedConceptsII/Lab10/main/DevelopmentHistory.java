package Lab10;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @Documented @interface DevelopmentHistory {
    int version() default 1;
    String developer() default "";
    String tester() default "";
}

