package OCP.example4.solution;

/**
 * Created by jubair.
 * Date: 10/10/22
 * Time: 6:31 PM
 */

public class Executive implements IMastersProgram{
    String major;
    public Executive(String major){
        this.major = major;
    }
    @Override
    public boolean isEligible(float cgpa, String major) {
        return (cgpa >= 3.75 || this.major.equals(major));
    }

    @Override
    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks) {
        return theoryMarks;
    }
}
