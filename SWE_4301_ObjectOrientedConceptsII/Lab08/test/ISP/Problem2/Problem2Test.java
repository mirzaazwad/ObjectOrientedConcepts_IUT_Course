package Lab08.ISP.Problem2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Problem2Test {
    @Test
    public void TestCarStartEngine(){
        assertTrue(new Car().startEngine());
    }

    @Test
    public void TestDroneStartEngine(){
        assertTrue(new Drone().startEngine());
    }

    @Test
    public void TestDroneTurnCameraOn(){
        assertTrue(new Drone().turnCameraOn());
    }

    @Test
    public void TestDroneTurnCameraOff(){
        assertTrue(new Drone().turnCameraOff());
    }

    @Test
    public void TestCarTurnRadioOn(){
        assertTrue(new Car().turnRadioOn());
    }
    @Test
    public void TestCarTurnRadioOff(){
        assertTrue(new Car().turnRadioOff());
    }

    @Test
    public void TestDroneFunctionlitiesInCar(){
        Car car=new Car();
        assertFalse(car instanceof DroneSwitches);
    }

    @Test
    public void TestCarFunctionlitiesInDrone(){
        Drone drone=new Drone();
        assertFalse(drone instanceof CarSwitches);
    }


}
