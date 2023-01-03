package Lab11;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeDBTest {
    @Test
    public void ageFilter(){
        Employee employee=new Employee(212,"Mirza",23,500);
        Employee employee1=new Employee(200,"Azwad",22,500);
        EmployeeDB edb=new EmployeeDB();
        edb.save(employee);
        edb.save(employee1);
        List<Employee>emp=edb.ageFilter(23);
        assertEquals(1,emp.size());
    }

    @Test
    public void salaryFilter(){
        Employee employee=new Employee(212,"Mirza",23,500);
        Employee employee1=new Employee(200,"Azwad",22,500);
        EmployeeDB edb=new EmployeeDB();
        edb.save(employee);
        edb.save(employee1);
        List<Employee>emp=edb.salaryFilter(499);
        assertEquals(2,emp.size());
    }
}
