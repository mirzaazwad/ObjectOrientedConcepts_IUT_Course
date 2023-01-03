package Lab10;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestFaculty {
    @Test
    public void TestFacultyTeach(){
        Faculty faculty=new Faculty("Uncle Bob","Lecturer",25000);
        Course course=new Course("SWE4301","OOC II",3.00,CourseType.Theory);
        String res=faculty.teach(course);
        assertEquals(res,"Teaching Course{CourseCode='SWE4301', name='OOC II', credit=3.00, courseType=Theory}");
    }

    @Test
    public void TestFacultyResearch(){
        Faculty faculty=new Faculty("Uncle Bob","Lecturer",25000);
        assertEquals(faculty.research("String Theory"),"Researching String Theory");
    }

    @Test
    public void TestAnnotationFacultyClass(){
        Annotation annotation=Faculty.class.getAnnotation(DevelopmentHistory.class);
        if(annotation instanceof DevelopmentHistory){
            DevelopmentHistory devolopment=(DevelopmentHistory)annotation;
            assertEquals(2,devolopment.version());
            assertEquals("Mirza Azwad",devolopment.developer());
            assertEquals("Mirza Mohammad Azwad",devolopment.tester());
        }
    }

    @Test
    public void FacultyConstructor(){
        Constructor<?>[] constructors=Faculty.class.getDeclaredConstructors();
        ArrayList<Boolean> expected=new ArrayList<Boolean>();
        ArrayList<Boolean>received=new ArrayList<Boolean>();
        for(Constructor constructor:constructors){
            boolean annotationPresent = constructor.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            expected.add(true);
            received.add(annotationPresent);
            System.out.println(annotationPresent);
        }
        assertTrue(expected.containsAll(received));
    }

     @Test
    public void methodTest () {
        Object faculty = new Faculty (" jubair ", "AP", 123) ;
        Method[] methods = faculty . getClass () . getDeclaredMethods () ;
        List< String > actualMethodNames = new ArrayList< >() ;
        for ( Method m :methods ) {
            System . out . println ( m.getName () ) ;
            boolean annotationPresent = m.isAnnotationPresent (DevelopmentHistoryWithReviewer . class ) ;
            if( annotationPresent ) {
                System . out . println ( m . getDeclaredAnnotations () . length ) ;
                actualMethodNames . add ( m . getName () ) ;
                }
            }

        assertTrue ( Arrays. asList (" research ") . containsAll (actualMethodNames) ) ;
        }
}
