package lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by jubair.
 * Date: 29/10/22
 * Time: 12:50 PM
 */

public class StudentEnrollment {
    List<Student> students;
    public StudentEnrollment(){
        students = new ArrayList<>();
    }

    public void add(Student student){
        this.students.add(student);
    }

    public void remove(Student student){
        if(this.students.contains(student))
            this.students.remove(student);
    }

    public Optional<Student> get(String ID){
        Student desiredStudent = null;
        for (Student student :
                this.students) {
            if(student.getID().equals(ID))
                desiredStudent = student;
        }
        return Optional.of(desiredStudent);
    }

    public List<Student> getAllStudents(){
        return this.students;
    }
}
