package OCP.example2.solution;

/**
 * Created by jubair.
 * Date: 28/8/22
 * Time: 7:58 PM
 */

public abstract class Employee {
    public int ID;
    public String name;

    public Employee(int id, String name){
        this.ID = id;
        this.name = name;
    }

    public abstract double calculateBonus(double salary);

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
