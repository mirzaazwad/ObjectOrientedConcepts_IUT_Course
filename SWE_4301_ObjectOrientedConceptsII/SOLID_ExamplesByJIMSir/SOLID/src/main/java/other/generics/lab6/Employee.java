package other.generics.lab6;

/**
 * Created by jubair.
 * Date: 20/9/22
 * Time: 7:07 AM
 */

public abstract class Employee {
    protected int basicSalary;
    protected int daysWorked;

    public Employee(int basicSalary, int daysWorked) {
        this.basicSalary = basicSalary;
        this.daysWorked = daysWorked;
    }

    public abstract double yearlySalary();
    public abstract double yearlyLeaves();
}
