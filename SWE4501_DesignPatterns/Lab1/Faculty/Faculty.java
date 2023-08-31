package Lab1.Faculty;

import Lab1.Employee;
import Lab1.Libraries.MyDate;

public class Faculty extends Employee {
    protected Double officeHours;
    protected String rank;

    public Faculty(String name, String email, String phone, String address, MyDate date, Double salary, String office,
                   Double officeHours, String rank) {
        super(name, email, phone, address, date, salary, office);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Double getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHours(Double officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public String toString() {
        return Faculty.class.getName() + " " + this.getName();
    }
}
