package OCP.example4.solution;

/**
 * Created by jubair.
 * Date: 10/10/22
 * Time: 6:27 PM
 */

public class MastersProgram {
    private IMastersProgram type;

    public MastersProgram(DegreeType type, String major) {
        this.type = chooseMasterprogram (type,major);
    }

    public boolean isEligible(float cgpa, String major) {
        return type.isEligible(cgpa,major) ;
    }

    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks) {
        return type.getMarks(theoryMarks, thesisMarks, projectMarks);
    }

    public IMastersProgram chooseMasterprogram (DegreeType type,String major) {
        IMastersProgram master;
        if(type.equals(DegreeType.RegularThesis)) {
            master = new RegularThesis(major);
        } else if (type.equals(DegreeType.RegularNonThesis)) {
            master = new RegularNonThesis(major);
        } else master = new Executive(major);

        return master;
    }
}
