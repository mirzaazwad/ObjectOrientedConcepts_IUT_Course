package OCP.example3.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jubair.
 * Date: 10/10/22
 * Time: 9:46 PM
 */

class TripTest {

    @Test
    public void perHeadFareSedanTest(){
        Trip trip = new Trip(VehicleType.SEDAN, 25, 90, 3);
        int fare = trip.perHeadFare();
        assertEquals(325, fare);
    }

    @Test
    public void canTakeTripSedanTest(){
        Trip trip = new Trip(VehicleType.SEDAN, 25, 90, 3);
        assertTrue(trip.canTakeTrip());
        trip = new Trip(VehicleType.SEDAN, 50, 90, 4);
        assertFalse(trip.canTakeTrip());
        trip = new Trip(VehicleType.SEDAN, 15, 90, 5);
        assertFalse(trip.canTakeTrip());
    }
}