package Lab06.Refactoring;

public class Permanent extends Employee{

    public Permanent(int baseWage,int workingDays){
        this.basicWage=baseWage;
        this.workingDays=workingDays;
    }
    public double YearlyVacation(){
        return 20+workingDays*0.03;
    }
    public double YearlyWage(){
        return 12*(basicWage+basicWage*0.03+basicWage*2);
    }
}
