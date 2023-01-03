package other.generics;

/**
 * Created by jubair.
 * Date: 11/9/22
 * Time: 11:48 PM
 */

public class Person {
    String firstName;
    String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName(){
        System.out.println("Unknown");
        return firstName + " " + lastName;
    }
}
