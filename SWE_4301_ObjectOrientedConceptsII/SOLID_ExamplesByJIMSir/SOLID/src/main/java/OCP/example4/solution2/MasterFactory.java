package OCP.example4.solution2;

import OCP.example4.solution.*;

/**
 * Created by jubair.
 * Date: 10/10/22
 * Time: 7:13 PM
 */

public class MasterFactory {
    public IMastersProgram getMasterprogram (DegreeType type, String major) {
        IMastersProgram master;
        if(type.equals(DegreeType.RegularThesis)) {
            master = new RegularThesis(major);
        } else if (type.equals(DegreeType.RegularNonThesis)) {
            master = new RegularNonThesis(major);
        } else master = new Executive(major);

        return master;
    }
}
