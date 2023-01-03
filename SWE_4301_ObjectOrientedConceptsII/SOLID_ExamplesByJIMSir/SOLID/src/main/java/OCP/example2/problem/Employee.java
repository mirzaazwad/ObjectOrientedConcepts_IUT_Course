package OCP.example2.problem;

/**
 * Created by jubair.
 * Date: 28/8/22
 * Time: 7:42 PM
 */

public class Employee {
    public int ID;
    public String name;

    public Employee(int id, String name){
        this.ID = id;
        this.name = name;
    }

    public double calculateBonus(double salary){
        return salary * 0.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", Name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee jhon = new Employee(123, "Jhon");
        System.out.println(jhon);
        System.out.println(jhon.calculateBonus(10000));
    }
}
