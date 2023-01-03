package Lab09.ResultPublication;

import Lab09.StudentCollection.Student;

import java.util.Comparator;

public class CGPAComparator implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return a.CGPA.compareTo(b.CGPA);
    }
}
