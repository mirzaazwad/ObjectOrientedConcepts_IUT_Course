package Lab10;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestCourse {
    @Test
    public void testCourse(){
        Course course=new Course("CSE4304","DataStructures",3.00,CourseType.Lab);
        assertEquals(course.toString(),"Course{CourseCode='CSE4304', name='DataStructures', credit=3.00, courseType=Lab}");
    }

    @Test
    public void testAnnotationCourseClass(){
        Annotation annotation=Course.class.getAnnotation(DevelopmentHistory.class);
        if(annotation instanceof DevelopmentHistory){
            DevelopmentHistory devolopment=(DevelopmentHistory)annotation;
            assertEquals(1,devolopment.version());
            assertEquals("",devolopment.developer());
            assertEquals("",devolopment.tester());
        }
    }

}
