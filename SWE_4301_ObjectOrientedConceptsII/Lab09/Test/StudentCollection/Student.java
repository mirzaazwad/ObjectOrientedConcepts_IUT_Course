package Lab09.StudentCollection;

import java.util.Comparator;

enum Program{

    SWE,CSE,IT;
}
public class Student{
    public String studentID;
    public String name;
    public Program program;
    public Float CGPA;

    public Student(String studentID,String name,String program,float CGPA) throws InvalidStudentIDException{
        this.program=Program.valueOf(program);
        this.studentID=this.setStudentID(studentID);
        this.name=name;
        this.CGPA=CGPA;
    }


    public String Study(){
        return this.studentID+" is studying";
    }

    public String Play(){
        return this.studentID+" is playing";
    }

    public String setStudentID(String ID) throws InvalidStudentIDException{
        if(ID.length()!=9){
            throw new InvalidStudentIDException("Student ID needs to have a length of 9");
        }
        return ID;
    }

    public String getStudentID(){
        return this.studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + this.studentID + '\'' +
                ", name='" + this.name + '\'' +
                ", program=" + this.program +
                ", CGPA=" + String.valueOf(this.CGPA) +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return this.studentID.equals(((Student) obj).studentID);
    }


}
