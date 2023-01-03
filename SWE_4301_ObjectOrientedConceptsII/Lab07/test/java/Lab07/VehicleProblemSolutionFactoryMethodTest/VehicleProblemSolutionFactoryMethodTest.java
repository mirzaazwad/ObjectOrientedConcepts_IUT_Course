package Lab07.VehicleProblemSolutionFactoryMethodTest;
import Lab07.VehicleProblemSolutionFactoryMethod.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleProblemSolutionFactoryMethodTest {
    @Test
    public void TestSedanFare(){
        Trip trip=new Trip(VehicleType.SEDAN,1,10,10);
        assertEquals(370,trip.perHeadFare());
    }

    @Test
    public void TestSevenSeaterFare(){
        Trip trip=new Trip(VehicleType.SEVEN_SEATER,1,10,10);
        assertEquals(300,trip.perHeadFare());
        trip=new Trip(VehicleType.SEVEN_SEATER,2,9,10);
        assertEquals(150,trip.perHeadFare());
    }

    @Test
    public void TestMotorbikeFare(){
        Trip trip=new Trip(VehicleType.MOTOR_BIKE,1,10,10);
        assertEquals(200,trip.perHeadFare());
    }

    @Test
    public void TestSedanCanTakeTrip(){
        Trip trip=new Trip(VehicleType.SEDAN,1,10,10);
        assertTrue(trip.canTakeTrip());
        trip=new Trip(VehicleType.SEDAN,26,10,3);
        assertFalse(trip.canTakeTrip());
    }

    @Test
    public void TestSevenSeaterCanTakeTrip(){
        Trip trip=new Trip(VehicleType.SEDAN,1,10,10);
        assertTrue(trip.canTakeTrip());
        trip=new Trip(VehicleType.SEVEN_SEATER,12,10,8);
        assertFalse(trip.canTakeTrip());
    }

    @Test
    public void TestMotorbikeCanTakeTrip(){
        Trip trip=new Trip(VehicleType.MOTOR_BIKE,1,10,10);
        assertTrue(trip.canTakeTrip());
        trip=new Trip(VehicleType.MOTOR_BIKE,26,10,3);
        assertFalse(trip.canTakeTrip());
    }
}
