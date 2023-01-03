package Lab06.Refactoring;

public class MonthlyContract extends Employee{
    public MonthlyContract(int baseWage,int workingDays){
        this.basicWage=baseWage;
        this.workingDays=workingDays;
    }
    public double YearlyVacation(){
        return 21;
    }
    public double YearlyWage(){
        return basicWage*12;
    }
}
