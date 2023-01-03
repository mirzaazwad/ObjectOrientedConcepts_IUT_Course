package OCP.example2.solution;

/**
 * Created by jubair.
 * Date: 28/8/22
 * Time: 7:59 PM
 */

public class PermanentEmployee extends Employee{
    public PermanentEmployee(int id, String name){
        super(id, name);
    }

    @Override
    public double calculateBonus(double salary) {
        return salary * 0.1;
    }
}
