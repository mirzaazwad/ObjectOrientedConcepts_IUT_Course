package Lab1.Faculty;

import Lab1.Libraries.MyDate;
import Lab1.Staff.Staff;

class FullTime extends Staff {
    public FullTime(String name, String email, String phone, String address, MyDate date, Double salary, String office,
                    String title) {
        super(name, email, phone, address, date, salary, office, title);
    }

    @Override
    public String toString() {
        return FullTime.class.getName() + " " + this.getName();
    }
}
