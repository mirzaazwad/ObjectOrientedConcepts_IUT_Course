package L05_Tasks.ThirdTask;

public class Student extends Person{
    public String studentID;
    public Student(String name, String address, int age,String studentID){
        super(name,address,age);
        this.studentID=studentID;
    }

    @Override
    public String toString(){
        return this.name+"\t"+this.address+"\t"+Integer.toString(this.age)+"\t"+this.studentID;
    }


}
