package Lab10;

@DevelopmentHistory
public class Course {
    public String CourseCode;
    public String name;
    public double credit;
    public CourseType courseType;
    @DevelopmentHistoryWithReviewer
    public Course(String CourseCode,String name,double credit,CourseType courseType){
        this.courseType=courseType;
        this.credit=credit;
        this.name=name;
        this.CourseCode=CourseCode;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseCode='" + CourseCode + '\'' +
                ", name='" + name + '\'' +
                ", credit=" + String.format("%.2f",credit) +
                ", courseType=" + courseType.toString() +
                '}';
    }
}
