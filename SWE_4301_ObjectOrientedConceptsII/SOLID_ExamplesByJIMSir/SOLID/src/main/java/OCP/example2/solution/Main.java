package OCP.example2.solution;

/**
 * Created by jubair.
 * Date: 28/8/22
 * Time: 8:08 PM
 */

public class Main {
    public static void main(String[] args) {
        Employee jhon = new PermanentEmployee(123, "Jhon");
        Employee bob = new TemporaryEmployee(12, "Bob");
        System.out.println(jhon + " " + jhon.calculateBonus(20000));
        System.out.println(bob + " " + bob.calculateBonus(20000));
    }
}
