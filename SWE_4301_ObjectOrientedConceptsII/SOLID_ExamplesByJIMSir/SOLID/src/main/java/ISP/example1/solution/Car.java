package ISP.example1.solution;

/**
 * Created by jubair.
 * Date: 18/10/22
 * Time: 6:10 AM
 */

public class Car implements EngineSwitch, RadioSwitch {
    private boolean radioOn;

    @Override
    public void startEngine() {
        // ....
    }

    @Override
    public void turnRadioOn() {
        radioOn = true;
    }

    @Override
    public void turnRadioOff() {
        radioOn = false;
    }
}
