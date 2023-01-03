package assignment1;

import assignment1.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalendarTest {
    @Test
    public void TestDecember() throws CalendarException {
        Calendar date=new Calendar("31/12/2022");
        date.addDay();
        assertEquals(date.toString(),"01/01/2023");
    }
    @Test
    public void TestFebruaryNonLeapYear() throws CalendarException{
        Calendar date=new Calendar("28/02/2023");
        date.addDay();
        assertEquals(date.toString(),"01/03/2023");
    }

    @Test
    public void TestCalendarExceptionNonLeapYear(){
        boolean exception=false;
        try{
            Calendar date=new Calendar("29/02/2023");
        }
        catch(CalendarException e){
            System.out.println("Date is incorrect");
            exception=true;
        }
        finally {
            assertTrue(exception);
        }
    }

    @Test
    public void TestCalendarExceptionDay(){
        boolean exception=false;
        try{
            Calendar date=new Calendar("32/01/2023");
        }
        catch(CalendarException e){
            System.out.println("Date is incorrect");
            exception=true;
        }
        finally {
            assertTrue(exception);
        }
    }

    @Test
    public void TestCalendarExceptionMonth(){
        boolean exception=false;
        try{
            Calendar date=new Calendar("31/13/2023");
        }
        catch(CalendarException e){
            System.out.println("Date is incorrect");
            exception=true;
        }
        finally {
            assertTrue(exception);
        }
    }

    @Test
    public void TestCalendarExceptionYear(){
        boolean exception=false;
        try{
            Calendar date=new Calendar("31/12/-1");
        }
        catch(CalendarException e){
            System.out.println("Date is incorrect");
            exception=true;
        }
        finally {
            assertTrue(exception);
        }
    }

    @Test
    public void TestAddDays() throws CalendarException {
        Calendar date=new Calendar("01/12/2019");
        date.addDays(31+31+29);
        assertEquals(date.toString(),"01/03/2020");
    }

    @Test
    public void TestFebruaryLeapYear() throws CalendarException {
        Calendar date=new Calendar("29/02/2020");
        date.addDay();
        assertEquals(date.toString(),"01/03/2020");
    }

    @Test
    public void TestMonth31Days() throws CalendarException {
        Calendar date=new Calendar("31/03/2023");
        date.addDay();
        assertEquals(date.toString(),"01/04/2023");
    }

    @Test
    public void TestMonth30Days() throws CalendarException {
        Calendar date=new Calendar("30/04/2023");
        date.addDay();
        assertEquals(date.toString(),"01/05/2023");
    }
}
