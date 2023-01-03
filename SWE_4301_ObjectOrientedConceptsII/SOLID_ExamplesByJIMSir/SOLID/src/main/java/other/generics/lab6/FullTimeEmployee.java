package other.generics.lab6;

/**
 * Created by jubair.
 * Date: 20/9/22
 * Time: 7:10 AM
 */

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(int basicSalary, int daysWorked) {
        super(basicSalary, daysWorked);
    }

    @Override
    public double yearlySalary() {
        return 12 * (basicSalary + basicSalary * 0.6 + basicSalary * 1.2);
    }

    @Override
    public double yearlyLeaves() {
        return 10 + daysWorked * .05;
    }
}
