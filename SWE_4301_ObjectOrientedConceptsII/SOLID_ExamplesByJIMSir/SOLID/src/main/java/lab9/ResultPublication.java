package lab9;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by jubair.
 * Date: 3/11/22
 * Time: 1:11 PM
 */

public class ResultPublication {
    public List<Student> sortByID(List<Student> studentList){

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getID().compareTo(o2.getID());
            }
        });
        return studentList;
    }

    public List<Student> sortByIDAndName(List<Student> studentList){

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getID().compareTo(o2.getID()) == 0)
                    return o1.getName().compareTo(o2.getName());
                else return o1.getID().compareTo(o2.getID());
            }
        });
        return studentList;
    }
}
