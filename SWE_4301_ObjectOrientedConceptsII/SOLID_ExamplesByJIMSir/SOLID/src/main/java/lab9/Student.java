package lab9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jubair.
 * Date: 29/10/22
 * Time: 11:39 AM
 */

public class Student {
    @NotNull(value="sfasf")
    private String ID;
    private String name;
    private double CGPA;

    public Student(String ID, @NotNull String name, double CGPA) {
        this.ID = ID;
        this.name = name;
        this.CGPA = CGPA;
    }

    @Deprecated
    public String getID() {
        return ID;
    }

    public void setID(String ID) throws InvalidIDExceptioin{
        if(ID.length() == 9)
            this.ID = ID;
        else
            throw new InvalidIDExceptioin("ID must be 9 digit long");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }

    @SafeVarargs
    public static void hudai(List... abc){
        for (List<String> topic : abc) {
            System.out.println(topic);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", CGPA=" + CGPA +
                '}';
    }

    @SuppressWarnings({"hudai"})
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("OOPS");
        list.add("COLLECTION");
        Student.hudai(list);

        Student s = new Student("sf", "ds", 2);
        s.getID();
    }
}
