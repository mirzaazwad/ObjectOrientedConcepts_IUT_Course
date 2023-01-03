package Lab11;

import org.junit.platform.commons.util.StringUtils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class EmployeeDB {

    private List<Employee> employeeList;
    public EmployeeDB(){
        employeeList=new ArrayList<Employee>();
    }

    public void save(Employee employee) {
        employeeList.add(employee);
        FileWriter fw = null;
        try {
            fw = new FileWriter("myfile.txt", true);
            fw.write(employee.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Employee> ageFilter(int age){
        return this.employeeList . stream ()
         . filter ( e -> e .getAge () == age )
         . collect ( Collectors. toList () ) ;
    }

    public List<Employee> salaryFilter(int salary){
        return this.employeeList . stream ()
                . filter ( e -> e .getSalary () > salary )
                . collect ( Collectors. toList () ) ;
    }

    public int totalSalary(int salary){
        List<Employee>output= this.employeeList . stream ()
                . filter ( e -> e .getSalary () > salary )
                . collect ( Collectors. toList () ) ;
        int result=0;
        for(Employee employee:employeeList){
            result+=employee.getSalary();
        }
        return result;
    }

    public List<Integer> incrementMapper(int increment){
        return this.employeeList.stream ().map ( e -> (e.getSalary()*(100+increment))/100).collect(Collectors.toList());
    }

    public void addEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public List<Employee> add(List<Employee> employees, Employee
            employee) {
        employees.add(employee);
        return employees;
    }

    public List<Employee> importFromFile() {
        List<Employee> employeeList = new ArrayList<Employee>();
        File fr = null;
        try {
            fr = new File("C:\\Users\\Mirza Mohammad Azwad\\IdeaProjects\\PostMidLab\\ myfile.txt");
            Scanner filereader = new Scanner(fr);
            while (filereader.hasNextLine()) {
                String data = filereader.nextLine();
                String[] stngArray = data.split("'");
                Employee employee = new Employee(Integer.valueOf(stngArray[1]), stngArray[3],Integer.valueOf(stngArray[5]),Integer.valueOf(stngArray[7]));
                employeeList.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return employeeList;
        }

    }

    // this code will give error if there is no file
    public void anotherSave() {
        try {
            Files.write(Paths.get(" myfile . txt "), " the text ".getBytes(),
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

