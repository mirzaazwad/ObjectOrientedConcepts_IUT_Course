package Lab09.StudentCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentEnrollment {
    public List<Student> studentList;
    public StudentEnrollment(){
        studentList=new ArrayList<Student>();
    }

    public Student get_Student(String studentID) throws NotFoundException{
        for(Student student:studentList) {
            if (student.studentID.equals(studentID)) {
                return student;
            }
        }
        throw new NotFoundException("Student is not in list");
    }

    public void remove(String studentID){
        int size=studentList.size();
        for(int i=0;i<size;i++){
            if(studentList.get(i).studentID.equals(studentID)){
                studentList.remove(i);
            }
        }
    }

    public List<Student> getAll(){
        return studentList;
    }

    public void add(Student student){
        studentList.add(student);
    }

    public void remove(Student student){
        studentList.remove(student);
    }

    public Student get_Student(Student student) throws NotFoundException{
        for(Student dummy_student:studentList) {
            if (dummy_student.equals(student)) {
                return dummy_student;
            }
        }
        throw new NotFoundException("Student is not in list");
    }

    public void Print(){
        Iterator<Student> iterator=studentList.iterator();
        while(iterator.hasNext()){
            Student element=iterator.next();
            System.out.println(element);
        }
    }

}
