package Lab09.ResultPublication;

import Lab09.StudentCollection.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ResultPublication {
    public List<Student> studentList;
    public ResultPublication(List<Student>students){
        this.studentList=students;
    }

    public List<Student> sortByID(){
        List<Student>temp=new ArrayList<Student>();
        temp.addAll(studentList);
        temp.sort(new IDComparator());
        return temp;
    }
    public List<Student> sortByName(){
        List<Student>temp=new ArrayList<Student>();
        temp.addAll(studentList);
        temp.sort(new NameComparator());
        return temp;
    }

    public List<Student> sortByCGPA(){
        List<Student>temp=new ArrayList<Student>();
        temp.addAll(studentList);
        temp.sort(new CGPAComparator().reversed());
        return temp;
    }

    public List<Student> sortByCGPA_ID(){
        List<Student>temp=new ArrayList<Student>();
        temp.addAll(studentList);
        temp.sort(new CGPAIDComparator().reversed());
        return temp;
    }

    public boolean ExportData(Export export){
        try{
            export.CreateFile();
            export.export(this.studentList);
            return true;
        }
        catch(IOException e){
            return false;
        }
    }

}
