package other.annotations;

/**
 * Created by jubair.
 * Date: 4/11/22
 * Time: 10:00 AM
 */

@Description(author = "Jubair", currentVersion = 1, reviewers = {"Alice", "Bob"})
public class AnnotationTest {
    @Marker
    int id;

    @Deprecated(since = "Use some other function")
    public void greeting(String name){
        System.out.println("Hello" + name);
    }

    @Marker
    @Description(author = "Jubair", currentVersion = 1, reviewers = {"Alice", "Bob"})
    public void demo(){
        System.out.println("Marker demo");
    }

    @Message(greeting = "Hello")
    public void single_value(){
        System.out.println("Single value annotation");
    }




    public static void main(String[] args) {
        AnnotationTest annotationTest = new AnnotationTest();
        annotationTest.demo();
        annotationTest.single_value();

        Bird bird = new Bird();
        bird.sayWhatDoYouWant();
        bird.birdListWithColor();
    }
}
