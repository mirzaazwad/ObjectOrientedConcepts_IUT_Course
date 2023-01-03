package Lab09.ResultPublication;

import Lab09.StudentCollection.Student;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ExportCSV extends Export {
    public ExportCSV(String filename) {
        super(filename);
    }

    public void export(List<Student> list) throws IOException{
        BufferedWriter write=new BufferedWriter(new FileWriter(filename,true));
        for(Student student:list){
            write.append(student.studentID+","+student.name+","+String.valueOf(student.program)+","+String.format("%.2f",student.CGPA)+"\n");
        }
        write.close();
    }
}
