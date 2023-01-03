package other.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jubair.
 * Date: 12/9/22
 * Time: 7:44 AM
 */

public class Student extends Person{

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public <T> void printList(List<? extends Person> list){
//        list.add(new Faculty("asd", "sfd"));
        for (Person p :
                list) {
            System.out.println(p);
        }

        Person[] aa;
        Student[] ba = new Student[3];
        aa = ba; // allowed! B[] is subtype of A[]
        aa[0] = new Student("", "");
        aa[1] = new Person("", ""); // java.lang.ArrayStoreException: A
    }

    public <T extends Comparable<T>> void underLimit(List<T> myList, T limit) {
        for (T e : myList) {
            if (e.compareTo(limit) < 0)
                System.out.println(e);
        }
    }

    public void add(Object element){
        Student element1 = (Student) element;
        System.out.println(element1);
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("ab", "cd"));
        list.add(new Student("ab", "cd"));
        list.add(new Student("ab", "cd"));
//        list.add(new Faculty("asd", "sfd"));
        Student student = new Student("sdf", "sf");
//        student.printList(list);

        List<Student> hudai = list;
//        student.printList(hudai);

        student.add(new Student("", ""));
    }
}
