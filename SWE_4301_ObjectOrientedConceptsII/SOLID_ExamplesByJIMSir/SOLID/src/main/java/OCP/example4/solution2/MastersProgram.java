package OCP.example4.solution2;

import OCP.example4.solution.DegreeType;
import OCP.example4.solution.IMastersProgram;

/**
 * Created by jubair.
 * Date: 10/10/22
 * Time: 7:15 PM
 */

public class MastersProgram {
    private IMastersProgram type;

    public MastersProgram(DegreeType type, String major) {
        this.type = new MasterFactory().getMasterprogram(type, major);
    }

    public boolean isEligible(float cgpa, String major) {
        return type.isEligible(cgpa,major) ;
    }

    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks) {
        return type.getMarks(theoryMarks, thesisMarks, projectMarks);
    }
}
