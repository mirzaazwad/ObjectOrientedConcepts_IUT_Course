package lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by jubair.
 * Date: 1/11/22
 * Time: 10:13 AM
 */

public class XMLFormatter implements IFormatter{
    @Override
    public File format(List<Student> list) {
        File file = new File("student.xml");
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(file);
            printWriter.write("<xml>");
            for (Student eachStudent:
                 list) {
                printWriter.write("<Student>");
                for (Student student:
                        list) {
                    printWriter.write("<ID>" + student.getID() + "</ID");
                    printWriter.write("<Name>" + student.getID() + "</Name");
                }
                printWriter.write("</Student>");
            }
            printWriter.write("</xml>");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return file;
    }
}
