package Lab09.StudentCollection.StudentEnrollmentTest;

import Lab09.StudentCollection.InvalidStudentIDException;
import Lab09.StudentCollection.NotFoundException;
import Lab09.StudentCollection.Student;
import Lab09.StudentCollection.StudentEnrollment;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentEnrollmentTest {
    @Test
    public void TestAdd() throws InvalidStudentIDException, NotFoundException {
        Student student1 = new Student("123456787","Rahim","SWE",3.80f);
        Student student2 = new Student("123456788","Rahim","SWE",3.80f);
        Student student3 = new Student("123456789","Rahim","SWE",3.80f);
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        studentEnrollment.add(student1);
        studentEnrollment.add(student2);
        studentEnrollment.add(student3);
        assertEquals(studentEnrollment.studentList.size(),3);
    }

    @Test
    public void TestStudentRemove() throws InvalidStudentIDException{
        Student student1 = new Student("123456787","Rahim","SWE",3.80f);
        Student student2 = new Student("123456788","Rahim","SWE",3.80f);
        Student student3 = new Student("123456789","Rahim","SWE",3.80f);
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        studentEnrollment.add(student1);
        studentEnrollment.add(student2);
        studentEnrollment.add(student3);
        studentEnrollment.remove(student1);
        assertEquals(studentEnrollment.studentList.size(),2);
    }

    @Test
    public void TestStudentIDRemove() throws InvalidStudentIDException{
        Student student1 = new Student("123456787","Rahim","SWE",3.80f);
        Student student2 = new Student("123456788","Rahim","SWE",3.80f);
        Student student3 = new Student("123456789","Rahim","SWE",3.80f);
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        studentEnrollment.add(student1);
        studentEnrollment.add(student2);
        studentEnrollment.add(student3);
        studentEnrollment.remove("123456789");
        assertEquals(studentEnrollment.studentList.size(),2);
    }

    @Test
    public void TestGetByID() throws InvalidStudentIDException,NotFoundException{
        Student student1 = new Student("123456787","Rahim","SWE",3.80f);
        Student student2 = new Student("123456788","Karim","SWE",3.80f);
        Student student3 = new Student("123456789","Barkat","SWE",3.80f);
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        studentEnrollment.add(student1);
        studentEnrollment.add(student2);
        studentEnrollment.add(student3);
        assertEquals(studentEnrollment.get_Student("123456788").name,"Karim");
    }

    @Test
    public void TestGetByStudent() throws InvalidStudentIDException,NotFoundException{
        Student student1 = new Student("123456787","Rahim","SWE",3.80f);
        Student student2 = new Student("123456788","Karim","SWE",3.80f);
        Student student3 = new Student("123456789","Barkat","SWE",3.80f);
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        studentEnrollment.add(student1);
        studentEnrollment.add(student2);
        studentEnrollment.add(student3);
        assertEquals(studentEnrollment.get_Student(student2).name,"Karim");
    }

    @Test
    public void TestGetAll() throws InvalidStudentIDException{
        Student student1 = new Student("123456787","Rahim","SWE",3.80f);
        Student student2 = new Student("123456788","Karim","SWE",3.80f);
        Student student3 = new Student("123456789","Barkat","SWE",3.80f);
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        studentEnrollment.add(student1);
        studentEnrollment.add(student2);
        studentEnrollment.add(student3);
        List<Student> list=new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        assertTrue(list.equals(studentEnrollment.studentList));
    }



}
