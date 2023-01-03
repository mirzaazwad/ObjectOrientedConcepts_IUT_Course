package Lab06.Refactoring;

public class DayLabour extends Employee{
    public DayLabour(int baseWage,int workingDays){
        this.basicWage=baseWage;
        this.workingDays=workingDays;
    }
    public double YearlyVacation(){
        return 0;
    }
    public double YearlyWage(){
        return 12*(workingDays*(basicWage/25));
    }
}
