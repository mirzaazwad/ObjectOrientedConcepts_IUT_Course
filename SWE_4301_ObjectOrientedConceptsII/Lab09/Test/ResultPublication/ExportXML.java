package Lab09.ResultPublication;

import Lab09.StudentCollection.Student;

import java.io.*;
import java.util.List;
import java.lang.reflect.*;

public class ExportXML extends Export{
    public ExportXML(String filename) {
        super(filename);
    }

    public void export(List<Student> list) throws IOException{
        BufferedWriter write=new BufferedWriter(new FileWriter(this.filename,true));
        Field[] fields=Student.class.getFields();
        Class className=Student.class;
        write.append("<xml>\n");
        for(Student student:list){
            write.append("<"+className.getSimpleName()+">\n");
            for(Field field:fields){
                write.append("<"+field.getName()+">");
                field.setAccessible(true);
                try{
                    Object value=field.get(student);
                    if(value instanceof Float || value instanceof Double){
                        write.append(String.format("%.2f",value));
                    }
                    else{
                        write.append(value.toString());
                    }
                }
                catch(IllegalAccessException e){

                }
                write.append("</"+field.getName()+">\n");
            }
            write.append("</"+className.getSimpleName()+">\n");
        }
        write.append("</xml>\n");
        write.close();
    }
}
