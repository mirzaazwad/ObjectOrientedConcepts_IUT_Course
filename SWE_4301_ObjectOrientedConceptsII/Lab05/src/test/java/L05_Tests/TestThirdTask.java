package L05_Tests;

import L05_Tasks.ThirdTask.Person;
import L05_Tasks.ThirdTask.PrinterGenerics;
import L05_Tasks.ThirdTask.Student;
import L05_Tasks.ThirdTask.Faculty;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestThirdTask {
    @Test
    public void TestList(){
        ArrayList<String> output=new ArrayList<String>();
        Faculty faculty=new Faculty("Mohsinul","Mohammadpur",23,"Professor");
        Student student=new Student("Mirza","Mohammadour",21,"200042121");
        output.add(faculty.toString());
        output.add(student.toString());
        PrinterGenerics<Person> print=new PrinterGenerics<Person>();
        ArrayList<Person>persons=new ArrayList<Person>();
        persons.add(faculty);
        persons.add(student);
        ArrayList<String>output2=print.printList(persons);
        output2=print.printList(persons);
        for(int i=0;i<output.size();i++){
            assertEquals(output.get(i),output2.get(i));
        }
    }


}
