package Lab11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    public void TestEmployee(){
        Employee employee=new Employee(212,"Mirza",21,5000);
        System.out.println(employee.toString());
    }
}
