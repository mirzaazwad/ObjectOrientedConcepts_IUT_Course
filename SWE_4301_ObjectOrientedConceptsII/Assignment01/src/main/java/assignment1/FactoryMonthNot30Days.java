package assignment1;

import java.util.Arrays;
import java.util.List;

public class FactoryMonthNot30Days {
    public List<Integer>MonthWith31DaysList;
    public Month MonthType;
    public FactoryMonthNot30Days(Integer day,Integer month, Integer year) throws CalendarException{
        this.MonthWith31DaysList= Arrays.asList(1,3,5,7,8,10,12);
        if(month.equals(12)){
            this.MonthType=new December(day,year);
        }
        else if(this.MonthWith31DaysList.contains(month)){
            this.MonthType=new MonthWith31Days(day,month,year);
        }
        else{
            this.MonthType=new February(day,year);
        }
    }
}
