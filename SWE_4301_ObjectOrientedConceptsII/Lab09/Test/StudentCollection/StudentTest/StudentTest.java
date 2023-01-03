package Lab09.StudentCollection.StudentTest;
import Lab09.StudentCollection.InvalidStudentIDException;
import Lab09.StudentCollection.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    public void TestStudy() throws InvalidStudentIDException {
        Student student = new Student("123456789","Rahim","SWE",3.80f);
        assertEquals(student.Study(),"123456789 is studying");
    }
    @Test
    public void TestPlay() throws InvalidStudentIDException{
        Student student = new Student("123456789","Rahim","SWE",3.80f);
        assertEquals(student.Play(),"123456789 is playing");
    }

    @Test
    public void TestInvalidID() throws InvalidStudentIDException{
        Student student = new Student("123456789","Barkat","SWE",3.80f);
        InvalidStudentIDException thrown = assertThrows(
                InvalidStudentIDException.class,
                () -> student.setStudentID("0123456789"),
                "Student ID needs to have a length of 9"
        );
        assertEquals(thrown.getMessage(),"Student ID needs to have a length of 9");

    }
}
