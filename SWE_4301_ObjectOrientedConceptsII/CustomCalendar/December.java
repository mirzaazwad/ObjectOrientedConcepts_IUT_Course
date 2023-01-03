package Calendar;

public class December extends Month{
    public December(Integer day,Integer year) throws CalendarException{
        super(day,12,year);
        this.set_max_day(31);
        this.check_day();
    }

    @Override
    public void addDay(){
        if(this.day==this.max_day){
            this.day=1;
            this.month=1;
            this.year++;
        }
        else{
            this.day++;
        }
    }
}
