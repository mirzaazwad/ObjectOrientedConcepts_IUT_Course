package Lab07.MastersProgramSolutionFactoryMethod;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MastersProgramTest {
    @Test
    public void isEligibleRegularThesis() {
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "swe");
        boolean isEligible = mp.isEligible(2, "swe");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.9f, "swe");
        assertTrue(isEligible);
    }

    @Test
    public void getMarksRegularThesis() {
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "swe");
        int marks = mp.getMarks(80, 60, 40);
        assertEquals(140, marks);
    }



    @Test
    public void isEligibleRegularThesisDifferentMajor() {
        MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "cse");
        boolean isEligible = mp.isEligible(3.9f, "swe");
        assertFalse(isEligible);
    }

    @Test
    public void isEligibleRegularNonThesis(){
        MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "swe");
        boolean isEligible = mp.isEligible(2, "cse");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.9f, "swe");
        assertTrue(isEligible);
    }

    @Test
    public void getMarksRegularNonThesis() {
        MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "swe");
        int marks = mp.getMarks(80, 60, 40);
        assertEquals(100, marks);
    }

    @Test
    public void isEligibleRegularNonThesisDifferentMajor() {
        MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "cse");
        boolean isEligible = mp.isEligible(3.9f, "swe");
        assertFalse(isEligible);
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
    public void getMarksExecutive() {
        MastersProgram mp = new MastersProgram(DegreeType.Executive, "swe");
        int marks = mp.getMarks(80, 60, 40);
        assertEquals(80, marks);
    }

    @Test
    public void isEligibleExecutiveDifferentMajor() {
        MastersProgram mp = new MastersProgram(DegreeType.Executive, "cse");
        boolean isEligible = mp.isEligible(3.9f, "swe");//OR CONDITION for 3.75 OR DifferentMajor
        assertTrue(isEligible);
        isEligible = mp.isEligible(3.5f, "swe");//OR CONDITION for 3.75 OR DifferentMajor
        assertFalse(isEligible);
    }
}
