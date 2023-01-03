package Lab11;


import java.util.Date;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Locale;

public class Employee {
    private int ID;
    private String name;
    private int experience ;
    private int age;
    public int salary;

    public Employee(int ID, String name,int age,int salary) {
        this.ID = ID;
        this.name = name;
        this.age=age;
        this.salary=salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int newID) {
        this.ID = newID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age=age;
    }

    @Override
    public String toString() {
        return " Employee {" + "ID= '" + ID + '\''+", name = '" + name + "'}";
    }

    public void setExperience(Date joining) {
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.setTime(joining);
        LocalDateTime now = LocalDateTime.now();
        int years = now.getYear() - calendar.get(Calendar.YEAR);
        this.experience = years;
    }

    public int getExperience(){
        return this.experience;
    }
}