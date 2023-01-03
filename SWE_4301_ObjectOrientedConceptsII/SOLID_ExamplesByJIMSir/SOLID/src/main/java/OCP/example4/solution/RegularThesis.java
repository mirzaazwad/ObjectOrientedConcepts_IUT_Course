package OCP.example4.solution;

/**
 * Created by jubair.
 * Date: 10/10/22
 * Time: 6:32 PM
 */

public class RegularThesis implements IMastersProgram{
    String major;
    public RegularThesis(String major){
        this.major = major;
    }

    @Override
    public boolean isEligible(float cgpa, String major) {
        return this.major.equals(major) && cgpa >= 3.8;
    }

    @Override
    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks) {
        return theoryMarks + thesisMarks;
    }
}
