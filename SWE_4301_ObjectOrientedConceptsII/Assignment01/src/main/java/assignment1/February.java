package assignment1;

public class February extends Month{

    private boolean LeapYear;

    public February(Integer day,Integer year) throws CalendarException{
        super(day,2,year);
        this.isLeapYear();
        if(this.LeapYear) {
            this.set_max_day(29);
        }
        else {
            this.set_max_day(28);
        }
        this.check_day();
    }

    private void isLeapYear(){
        this.LeapYear= (year%4==0);
    }

}
