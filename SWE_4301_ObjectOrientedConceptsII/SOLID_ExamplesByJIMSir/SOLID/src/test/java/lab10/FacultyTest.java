package lab10;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jubair.
 * Date: 8/11/22
 * Time: 9:36 AM
 */

class FacultyTest {

    @Test
    public void annotationDataTest(){
        Object faculty = new Faculty("jubair", "AP", 123);
        DevelopmentHistory declaredAnnotation = faculty.getClass().getDeclaredAnnotation(DevelopmentHistory.class);
        System.out.println(declaredAnnotation.version() + " " + declaredAnnotation.developer() + " " + declaredAnnotation.tester());
        assertTrue(Arrays.asList("1", "jubair", "known").containsAll(Arrays.asList(""+declaredAnnotation.version(), declaredAnnotation.developer(), declaredAnnotation.tester())));
    }

    @Test
    public void constructorTest(){
        Object faculty = new Faculty("jubair", "AP", 123);
        Constructor<?>[] declaredConstructors = faculty.getClass().getDeclaredConstructors();
        System.out.println("Number of cons: " + declaredConstructors.length);
        List<String> actualConstructorNames = new ArrayList<>();
        for (Constructor c:
                declaredConstructors) {
            System.out.println(c.getName());
            boolean annotationPresent = c.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if(annotationPresent) {
                System.out.println("Annotated Constructor: " + c.getDeclaredAnnotations().length);
                actualConstructorNames.add(c.getName());
            }
        }
        assertTrue ( Arrays.asList ("lab10.Faculty").containsAll ( actualConstructorNames ) ) ;
    }

    @Test
    public void methodTest(){
        Object faculty = new Faculty("jubair", "AP", 123);
        Method[] methods = faculty.getClass().getDeclaredMethods();
        List<String> actualMethodNames = new ArrayList<>();
        for (Method m:
             methods) {
            System.out.println(m.getName());
            boolean annotationPresent = m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if(annotationPresent) {
                System.out.println(m.getDeclaredAnnotations().length);
                actualMethodNames.add(m.getName());
            }
        }
        assertTrue ( Arrays.asList ("research").containsAll ( actualMethodNames ) ) ;
    }

    @Test
    public void AdderTest(){
        Class<Adder> adderClass = Adder.class;
        Method[] declaredMethods = adderClass.getDeclaredMethods();
        System.out.println(declaredMethods.length);


    }

}