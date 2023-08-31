package Lab1.Staff;

import Lab1.Employee;
import Lab1.Libraries.MyDate;

public class Staff extends Employee {
    protected String title;

    public Staff(String name, String email, String phone, String address, MyDate date, Double salary, String office,
                 String title) {
        super(name, email, phone, address, date, salary, office);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return Staff.class.getName() + " " + this.getName();
    }
}
