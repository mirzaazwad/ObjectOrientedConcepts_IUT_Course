package Lab1;

import Lab1.Libraries.MyDate;

public class Employee extends Person {
    protected MyDate date;
    protected Double salary;
    protected String office;

    public Employee(String name, String email, String phone, String address, MyDate date, Double salary,
            String office) {
        super(name, email, phone, address);
        this.date = date;
        this.salary = salary;
        this.office = office;
    }

    public MyDate getDate() {
        return date;
    }

    public Double getSalary() {
        return salary;
    }

    public String getOffice() {
        return office;
    }

    @Override
    public String toString() {
        return Employee.class.getName() + " " + this.getName();
    }

}
