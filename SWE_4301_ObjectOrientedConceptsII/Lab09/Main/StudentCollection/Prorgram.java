package Lab09.StudentCollection;

public class Prorgram {
    public static void main(String[] args) throws InvalidStudentIDException{
        Student student1 = new Student("123456787","Rahim","SWE",3.80f);
        Student student2 = new Student("123456788","Karim","SWE",3.80f);
        Student student3 = new Student("123456789","Barkat","SWE",3.80f);
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        studentEnrollment.add(student1);
        studentEnrollment.add(student2);
        studentEnrollment.add(student3);
        studentEnrollment.Print();
    }
}
