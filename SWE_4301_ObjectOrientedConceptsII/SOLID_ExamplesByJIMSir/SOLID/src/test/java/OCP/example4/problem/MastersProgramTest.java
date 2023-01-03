package OCP.example4.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jubair.
 * Date: 10/10/22
 * Time: 12:13 PM
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
    public void isEligibleThesisDifferentMajor(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "cse");
        boolean isEligible = mp.isEligible(3.9f, "swe");
        assertFalse(isEligible);
    }

    @Test
    public void getMarksThesis(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "swe");
        int marks = mp.getMarks(80,60, 40);
        assertEquals(140, marks);
    }

    @Test
    public void isEligibleNonThesis(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "cse");
        boolean isEligible = mp.isEligible(2, "cse");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.9f, "cse");
        assertTrue(isEligible);
    }

    @Test
    public void getMarksNonThesis(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "swe");
        int marks = mp.getMarks(80,60, 40);
        assertEquals(100, marks);
    }
}