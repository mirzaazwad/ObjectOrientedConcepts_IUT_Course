package other.annotations;

/**
 * Created by jubair.
 * Date: 4/11/22
 * Time: 7:18 AM
 */

@Schedule
@Schedule(time = "15:05")
@Schedule(time = "23:00")
public class Person {
    void scheduledAlarm() {
        Schedule[] schedules = Person.class.getAnnotationsByType(Schedule.class);
        for (Schedule s : schedules) {    // Iterating values
            System.out.println(s.time());
        }
    }


    public static void main(String[] args) {
        Person person = new Person();
        person.scheduledAlarm();
    }
}
