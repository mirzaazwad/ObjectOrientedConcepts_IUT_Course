package OCP.example2.problem;

/**
 * Created by jubair.
 * Date: 28/8/22
 * Time: 7:55 PM
 */

public class Employee2 {
    public int ID;
    public String name;
    public String employeeType;

    public Employee2(int id, String name, String empType){
        this.ID = id;
        this.name = name;
        this.employeeType = empType;
    }

    public double calculateBonus(double salary){
        if(this.employeeType.equals("Permanent"))
            return salary * 0.1;
        else return salary * 0.05;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", employeeType='" + employeeType + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee2 empJon = new Employee2(12, "Jon Snow", "Permanent");
        System.out.println(empJon);
        System.out.println(empJon.calculateBonus(50000));
    }
}
