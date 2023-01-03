package OCP.example4.solution;
import OCP.example4.solution.DegreeType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jubair.
 * Date: 10/10/22
 * Time: 6:45 PM
 */

class MastersProgramTest {
    @Test
    public void isEligibleThesis(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "swe");
        boolean isEligible = mp.isEligible(2, "swe");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.9f, "swe");
        assertTrue(isEligible);
    }

    @Test
    public void isEligibleExecutive(){
        MastersProgram mp = new MastersProgram(DegreeType.Executive, "swe");
        boolean isEligible = mp.isEligible(2, "cse");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.76f, "swe");
        assertTrue(isEligible);
    }

    @Test
    public void getMarksThesis(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "swe");
        int marks = mp.getMarks(80,60, 40);
        assertEquals(140, marks);
    }
}