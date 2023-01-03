package lab9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Created by jubair.
 * Date: 29/10/22
 * Time: 1:01 PM
 */

class StudentEnrollmentTest {
    StudentEnrollment studentEnrollment;
    StudentEnrollment studentEnrollmentMock = mock(StudentEnrollment.class);
    @BeforeEach
    void setup(){
        studentEnrollment = new StudentEnrollment();
        studentEnrollment.add(new Student("123456789", "Unknown", 4.00));
        studentEnrollment.add(new Student("987654321", "Test", 2.50));
    }

    @Test
    void add() {
        Student student = new Student("2020004201", "Hudai", 3.50);
        studentEnrollment.add(student);

        List<Student> expectedList = new ArrayList<>();
        expectedList.add(new Student("123456789", "Unknown", 4.00));
        expectedList.add(new Student("987654321", "Test", 2.50));
        expectedList.add(student);

        assertEquals(studentEnrollment.getAllStudents().size(), 3);
//        assertTrue(studentEnrollment.getAllStudents().size() == expectedList.size() && studentEnrollment.students.containsAll(expectedList)
//                && expectedList.containsAll(studentEnrollment.getAllStudents()));
//        assertArrayEquals(studentEnrollment.getAllStudents().toArray(), expectedList.toArray());
//        doNothing().when(studentEnrollmentMock).add(student);
//        verify(studentEnrollmentMock,times(1)).add(student);
    }

//    @Test(expected = ArithmeticException.class)
    @Test
    void setIDTest() {
        assertThrows(InvalidIDExceptioin.class, () -> {
            Student student = new Student("ds", "sfs", 3.4);
            student.setID("232");
        });

        Throwable exception = assertThrows(InvalidIDExceptioin.class, () -> {
            Student student = new Student("ds", "sfs", 3.4);
            student.setID("232");
        });
        assertEquals("ID must be 9 digit long", exception.getMessage());

    }

    @Test
    void remove() {
    }

    @Test
    void get() {
    }

    @Test
    void getAllStudents() {
    }
}