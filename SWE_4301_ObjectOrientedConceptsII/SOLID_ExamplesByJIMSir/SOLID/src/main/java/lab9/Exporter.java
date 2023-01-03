package lab9;

import java.io.File;
import java.util.List;

/**
 * Created by jubair.
 * Date: 1/11/22
 * Time: 10:13 AM
 */

public class Exporter {
    public File export(List<Student> studentList, IFormatter formatter){
        return formatter.format(studentList);
    }
}
