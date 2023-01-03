package other.generics.lab6;

/**
 * Created by jubair.
 * Date: 20/9/22
 * Time: 7:14 AM
 */

public class ContractualEmployee extends Employee{
    public ContractualEmployee(int basicSalary, int daysWorked) {
        super(basicSalary, daysWorked);
    }

    @Override
    public double yearlySalary() {
        return 12 * basicSalary;
    }

    @Override
    public double yearlyLeaves() {
        return 15;
    }
}
