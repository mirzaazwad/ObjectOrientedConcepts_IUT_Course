package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calendar {
    private List<Integer>monthWith30days;
    public Month factory;

    public Calendar(Integer day,Integer month,Integer year) throws CalendarException{
        set_Calendar(day,month,year);
    }

    public Calendar(String input) throws CalendarException{
        String[] date = input.split("/");
        set_Calendar(Integer.valueOf(date[0]),Integer.valueOf(date[1]),Integer.valueOf(date[2]));
    }

    private void  set_Calendar(Integer day,Integer month,Integer year) throws CalendarException{
        monthWith30days= Arrays.asList(4,6,9,11);
        if(monthWith30days.contains(month)){
            this.factory=new MonthWith30Days(day,month,year);
        }
        else{
            FactoryMonthNot30Days FactoryForMonth=new FactoryMonthNot30Days(day,month,year);
            this.factory=FactoryForMonth.MonthType;
        }
    }

    public void addDay() throws CalendarException{
        this.factory.addDay();
        set_Calendar(this.factory.get_day(),this.factory.get_month(),this.factory.get_year());
    }

    public void addDays(int days) throws CalendarException{
        for(int i=0;i<days;i++){
            this.addDay();
        }
    }

    @Override
    public String toString() {
        String day=("0"+String.valueOf(this.factory.get_day()));
        day=day.substring(day.length()-2);
        String month=("0"+String.valueOf(this.factory.get_month()));
        month=month.substring(month.length()-2);
        String year=("000"+String.valueOf(this.factory.get_year()));
        year=year.substring(year.length()-4);
        return day+"/"+month+"/"+year;
    }
}
