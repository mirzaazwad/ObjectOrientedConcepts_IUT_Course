package Lab09.ResultPublication;

import Lab09.StudentCollection.Student;

import java.util.Comparator;

public class CGPAIDComparator implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return a.CGPA.equals(b.CGPA) ? (-1)*a.studentID.compareTo(b.studentID) : a.CGPA.compareTo(b.CGPA);
    }
}
