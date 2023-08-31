package Lab1.Faculty;

import Lab1.Libraries.MyDate;
import Lab1.Staff.Staff;

class PartTime extends Staff {
    protected Double worked_hours;
    protected Double final_salary;

    public PartTime(String name, String email, String phone, String address, MyDate date, Double salary, String office,
                    String title,
                    Double worked_hours) {
        super(name, email, phone, address, date, salary, office, title);
        this.final_salary = salary * worked_hours;
        this.worked_hours = worked_hours;
    }

    public Double getWorked_hours() {
        return worked_hours;
    }

    public void setWorked_hours(Double worked_hours) {
        this.final_salary = this.salary * this.worked_hours;
        this.worked_hours = worked_hours;
    }

    public Double getFinal_salary() {
        return final_salary;
    }

    @Override
    public String toString() {
        return PartTime.class.getName() + " " + this.getName();
    }
}
