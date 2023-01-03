package other.generics.lab6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by jubair.
 * Date: 20/9/22
 * Time: 7:18 AM
 */

class EmployeeTest {

    @Test
    void yearlySalary() {
        Employee employee = new PartTimeEmployee(3000, 20);
        System.out.println(employee.yearlySalary());
        assertEquals(32724, employee.yearlySalary());
        System.out.println(employee.yearlyLeaves());
        assertEquals(0, employee.yearlyLeaves());

        employee = new ContractualEmployee(4000, 30);
        assertEquals(48000, employee.yearlySalary());
        assertEquals(15, employee.yearlyLeaves());
    }

    @Test
    void yearlyLeaves() {
        Employee employee = new PartTimeEmployee(3000, 20);
        Assertions.assertInstanceOf(Employee.class, employee);
        employee = new FullTimeEmployee(3000, 20);
        Assertions.assertInstanceOf(Employee.class, employee);
    }
}