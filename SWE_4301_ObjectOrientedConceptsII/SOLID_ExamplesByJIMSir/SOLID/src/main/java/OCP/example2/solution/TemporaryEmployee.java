package OCP.example2.solution;

/**
 * Created by jubair.
 * Date: 28/8/22
 * Time: 8:02 PM
 */

public class TemporaryEmployee extends Employee{
    public TemporaryEmployee(int id, String name){
        super(id, name);
    }

    @Override
    public double calculateBonus(double salary) {
        return salary * 0.05;
    }
}
