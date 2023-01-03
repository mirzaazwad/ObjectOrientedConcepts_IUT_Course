package ISP.example1.problem;

/**
 * Created by jubair.
 * Date: 18/10/22
 * Time: 6:06 AM
 */

public class Car implements Switches {
    public boolean radioOn;

    @Override
    public void startEngine() {
        // ...
    }

    @Override
    public boolean turnRadioOn() {
        radioOn = true;
        return radioOn;
    }

    @Override
    public void turnRadioOff() {
        radioOn = false;
    }

    @Override
    public void turnCameraOn() {
        // nothing to do here
    }

    @Override
    public void turnCameraOff() {
        // nothing to do here
    }
}
