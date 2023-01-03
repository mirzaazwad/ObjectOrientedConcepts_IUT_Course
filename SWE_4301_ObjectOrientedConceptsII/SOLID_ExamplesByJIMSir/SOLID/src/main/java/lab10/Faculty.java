package lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by jubair.
 * Date: 8/11/22
 * Time: 9:08 AM
 */

@DevelopmentHistory(developer = "jubair", tester = "known")
public class Faculty {

    String name;
    String designation;
    int salary;
    List<Course> courseList;

    @DevelopmentHistoryWithReviewer(devlopment = @DevelopmentHistory(version = 1, developer = "abc", tester = "vd"), reviewers = {"aabc", "def"})
    public Faculty(String name, String designation, int salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.courseList = new ArrayList<>();
    }

    public Faculty(String name, String designation, int salary, List<Course> courseList) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.courseList = courseList;
    }

    @DevelopmentHistoryWithReviewer(devlopment = @DevelopmentHistory(version = 1, developer = "abc", tester = "vd"), reviewers = {"aabc", "def"})
    public void research(String topic){
        System.out.println("Researching " + topic);
    }

    public void lambdaTry(){
        Adder sum = (a, b) -> {
            System.out.println(a + " " + b);
            return a + b;
        };
        System.out.println(sum.add(5, 3));

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(new Faculty("jubair", "AP", 123));
        faculties.add(new Faculty("jubair", "AP", 200));
        faculties.add(new Faculty("jubair", "AP", 13));

        List<Faculty> collect = faculties
                .stream()
                .filter(faculty -> faculty.salary > 100)
                .collect(Collectors.toList());

        List<Integer> collect2 = faculties
                .stream()
                .map(faculty -> (faculty.salary *= 2))
                .collect(Collectors.toList());

        for (Faculty faculty : collect) {
            System.out.println(faculty.salary);
        }
        System.out.println(collect.size());
    }

    public static void main(String[] args) {
        Faculty faculty = new Faculty("jubair", "AP", 123);
        faculty.research("abdc");
        faculty.lambdaTry();
    }
}
