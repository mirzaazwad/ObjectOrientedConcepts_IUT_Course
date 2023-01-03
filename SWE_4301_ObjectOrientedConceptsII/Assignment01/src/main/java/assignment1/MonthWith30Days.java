package assignment1;

public class MonthWith30Days extends Month{
    public MonthWith30Days(Integer day,Integer month,Integer year) throws CalendarException{
        super(day,month,year);
        this.set_max_day(30);
        this.check_day();
    }
}
