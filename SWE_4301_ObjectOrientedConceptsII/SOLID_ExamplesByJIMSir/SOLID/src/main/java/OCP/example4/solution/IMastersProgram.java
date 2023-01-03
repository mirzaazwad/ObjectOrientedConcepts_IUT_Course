package OCP.example4.solution;

/**
 * Created by jubair.
 * Date: 10/10/22
 * Time: 6:28 PM
 */

public interface IMastersProgram {
    boolean isEligible(float cgpa, String major);
    int getMarks(int theoryMarks, int thesisMarks, int projectMarks);
}
