package Lab09.ResultPublication;

import Lab09.StudentCollection.Student;

import java.util.Comparator;

public class IDComparator implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return a.studentID.compareTo(b.studentID);
    }
}


