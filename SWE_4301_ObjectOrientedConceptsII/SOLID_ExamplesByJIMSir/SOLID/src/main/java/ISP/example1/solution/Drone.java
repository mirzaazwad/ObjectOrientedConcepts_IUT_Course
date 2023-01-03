package ISP.example1.solution;

/**
 * Created by jubair.
 * Date: 18/10/22
 * Time: 6:07 AM
 */

public class Drone implements EngineSwitch, CameraSwitch {
    private boolean cameraOn;

    @Override
    public void startEngine() {
        // ....
    }

    @Override
    public void turnCameraOn() {
        cameraOn = true;
    }

    @Override
    public void turnCameraOff() {
        cameraOn = false;
    }
}
