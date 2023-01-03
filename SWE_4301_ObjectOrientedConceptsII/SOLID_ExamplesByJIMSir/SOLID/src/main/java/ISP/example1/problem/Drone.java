package ISP.example1.problem;

/**
 * Created by jubair.
 * Date: 18/10/22
 * Time: 6:06 AM
 */

public class Drone implements Switches {
    private boolean cameraOn;

    @Override
    public void startEngine() {
        // ...
    }


    @Override
    public void turnCameraOn() {
        cameraOn = true;
    }


    @Override
    public void turnCameraOff() {
        cameraOn = false;
    }


    @Override
    public boolean turnRadioOn() {
        // nothing to do here
        return false;
    }


    @Override
    public void turnRadioOff() {
        // nothing to do here
    }
}
