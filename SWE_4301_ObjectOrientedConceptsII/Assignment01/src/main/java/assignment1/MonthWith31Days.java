package assignment1;

public class MonthWith31Days extends Month{
    public MonthWith31Days(Integer day,Integer month,Integer year) throws CalendarException{
        super(day,month,year);
        this.set_max_day(31);
        this.check_day();
    }
}
