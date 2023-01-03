package Lab07.MastersProgramSolutionFactoryMethod;

public class RegularNonThesis implements IMastersProgram{
    private String major;
    public RegularNonThesis(String major){
        this.major=major;
    }
    public boolean isEligible(float cgpa,String major){
        return this.major.equals(major);
    }
    public int getMarks(int theoryMarks,int thesisMarks,int projectMarks){
        return theoryMarks+projectMarks/2;
    }
}
