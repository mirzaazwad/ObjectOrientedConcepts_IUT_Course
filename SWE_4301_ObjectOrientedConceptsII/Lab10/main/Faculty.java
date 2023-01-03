package Lab10;

import java.util.*;

@DevelopmentHistory(version =2,developer = "Mirza Azwad",tester = "Mirza Mohammad Azwad")
public class Faculty {
    public String name;
    public String designation;
    public Integer salary;
    public List<Course> courses;

    @DevelopmentHistoryWithReviewer(version = 2,developer = "Mirza Azwad",tester = "Mirza Mohammad Azwad",reviewers = {"Bob","Adam"})
    public Faculty(String name, String designation, Integer salary,List<Course>courses){
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        this.courses=courses;
    }
    @DevelopmentHistoryWithReviewer(version = 3,developer = "Mirza Azwad",tester = "Mirza Mohammad Azwad",reviewers = {"Adam"})
    public Faculty(String name, String designation, Integer salary){
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }
    @DevelopmentHistoryWithReviewer(version = 4,developer = "Mirza Azwad",tester = "Not Mirza",reviewers = {"Bob","Adam"})
    public String teach(Course course){
        return "Teaching "+course.toString();
    }

    @DevelopmentHistoryWithReviewer(version = 2,developer = "Mirza Mohammad Azwad",tester = "Not Mirza",reviewers = {"Bob","Adam"})
    public String research(String topic){
        return "Researching "+topic;
    }


}
