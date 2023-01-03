package other.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by jubair.
 * Date: 4/11/22
 * Time: 10:58 AM
 */

public class ReflectionDemo {
    public void hudai(){
        Annotation[] annotations = Description.class.getAnnotations();
        for (Annotation ann:
             annotations) {
            System.out.println(ann.toString());
//            System.out.println(ann.annotationType().getCanonicalName());
        }
    }

    public void annotationImplementedClass(){
        AnnotationTest annotationTest = new AnnotationTest();
        Method[] methods = annotationTest.getClass().getDeclaredMethods();
        System.out.println(methods.length);
        for (Method m:
             methods) {
            for (Annotation annotation : m.getDeclaredAnnotations()) {
                System.out.println(annotation.toString());
            }
        }

        Field[] fields = AnnotationTest.class.getDeclaredFields();
        System.out.println(fields.length);
        for (Field f:
                fields) {
            for (Annotation annotation : f.getDeclaredAnnotations()) {
                System.out.println(annotation.toString());
            }
        }
    }

    public static void main(String[] args) {
        ReflectionDemo reflectionDemo = new ReflectionDemo();
//        reflectionDemo.hudai();
        reflectionDemo.annotationImplementedClass();
    }

}
