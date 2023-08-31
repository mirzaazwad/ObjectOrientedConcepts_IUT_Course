package Lab1.Student;

import Lab1.Person;

public class Student extends Person {
    private status status;

    public Student(String name, String email, String phone, String address, status status) {
        super(name, email, phone, address);
        this.status = status;
    }

    public String getStatus() {
        return status.toString();
    }

    public void setStatus(status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return Student.class.getName() + " " + this.getName();
    }

}
