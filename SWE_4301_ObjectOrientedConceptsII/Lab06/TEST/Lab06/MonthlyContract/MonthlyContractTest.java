package Lab06.MonthlyContract;
import Lab06.Refactoring.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MonthlyContractTest {
    @Test
    public void TestPermanent(){
        Permanent permanent=new Permanent(25,3);
        assertEquals(permanent.YearlyVacation(),20.09);
        assertEquals(permanent.YearlyWage(),909.0);
    }


    @Test
    public void TestObject(){
        Permanent permanent=new Permanent(25,3);
        assertInstanceOf(Permanent.class,permanent);
    }

    @Test
    public void TestDayLabour(){
        DayLabour dayLabour=new DayLabour(25,3);
        assertEquals(dayLabour.YearlyVacation(),0);
        assertEquals(dayLabour.YearlyWage(),36.0);
    }

    @Test
    public void TestMonthlyContract(){
        MonthlyContract monthlyContract=new MonthlyContract(25,3);
        assertEquals(monthlyContract.YearlyVacation(),21);
        assertEquals(monthlyContract.YearlyWage(),300);
    }
}
