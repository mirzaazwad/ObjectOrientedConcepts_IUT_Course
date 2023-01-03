package assignment2.StampCoupling;

public class StudentQuizMarks {
    public String ID,name,address;
    public int Marks;
    public StudentQuizMarks(Student student,int Marks){//In this case the student marks can only keep the ID and the marks
        //but its requiring everything, a small change in the student class needs this class to be changed and redeployed
        this.ID=student.ID;
        this.name=student.name;
        this.address=student.address;
        this.Marks=Marks;
    }

}
