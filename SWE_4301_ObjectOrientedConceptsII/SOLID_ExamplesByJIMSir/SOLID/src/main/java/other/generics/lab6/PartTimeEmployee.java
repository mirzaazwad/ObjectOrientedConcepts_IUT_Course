package other.generics.lab6;

/**
 * Created by jubair.
 * Date: 20/9/22
 * Time: 7:15 AM
 */

public class PartTimeEmployee extends Employee{
    public PartTimeEmployee(int basicSalary, int daysWorked) {
        super(basicSalary, daysWorked);
    }

    @Override
    public double yearlySalary() {
        return 12 * (daysWorked * basicSalary / 22);
    }

    @Override
    public double yearlyLeaves() {
        return 0;
    }
}
