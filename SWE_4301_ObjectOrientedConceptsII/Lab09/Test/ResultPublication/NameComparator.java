package Lab09.ResultPublication;

import Lab09.StudentCollection.Student;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}
