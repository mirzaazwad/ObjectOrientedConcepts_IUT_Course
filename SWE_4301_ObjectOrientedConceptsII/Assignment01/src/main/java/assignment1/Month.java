package assignment1;

public class Month {
    protected Integer day;
    protected Integer year;
    protected Integer month;
    protected Integer max_day;
    protected Month(Integer day,Integer month,Integer year) throws CalendarException{
        this.set_day(day);
        this.set_month(month);
        this.set_year(year);
    }
    public Integer get_day(){
        return this.day;
    }
    public Integer get_month(){
        return this.month;
    }
    public Integer get_year(){
        return this.year;
    }
    protected void set_max_day(Integer max_day) throws CalendarException{
        if(max_day>31 || max_day<0){
            throw new CalendarException("Max Day is Incorrect");
        }
        this.max_day=max_day;
    }
    private void set_month(Integer month) throws CalendarException{
        if(month<0 || month>12){
            throw new CalendarException("Date is incorrect");
        }
        this.month=month;
    }
    protected void check_day() throws CalendarException{
        if(this.day>this.max_day){
            throw new CalendarException("Date is Incorrect");
        }
    }
    private void set_day(Integer day) throws CalendarException{
        if(day<0){
            throw new CalendarException("Date is incorrect");
        }
        this.day=day;
    }
    private void set_year(Integer year) throws CalendarException{
        if(year<0){
            throw new CalendarException("Date is incorrect");
        }
        this.year=year;
    }
    public void addDay(){
        if(this.day==this.max_day){
            this.day=1;
            this.month++;
        }
        else{
            this.day++;
        }
    }

}
