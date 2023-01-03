package OCP.example3.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jubair.
 * Date: 8/9/22
 * Time: 8:10 PM
 */

class TripTest {

    @Test
    void perHeadFare() {
        Trip trip = new Trip(VehicleType.SEDAN, 10, 100, 4);
        System.out.println(trip.perHeadFare());
        assertEquals(135, trip.perHeadFare());
    }

    @Test
    void canTakeTrip() {
        Trip trip = new Trip(VehicleType.SEDAN, 10, 100, 4);
        assertTrue(trip.canTakeTrip());
    }

    @Test
    void perHeadFareSedan() {
        Trip trip = new Trip(VehicleType.SEDAN, 10, 100, 4);
        System.out.println(trip.perHeadFare());
        assertEquals(135, trip.perHeadFare());
    }

    @Test
    void perHeadFareSevenSeater() {
        Trip trip = new Trip(VehicleType.SEVEN_SEATER, 5, 60, 2);
        System.out.println(trip.perHeadFare());
        assertEquals(135, trip.perHeadFare());
    }

    @Test
    void perHeadFareMotorBike() {
        Trip trip = new Trip(VehicleType.SEDAN, 10, 100, 4);
        System.out.println(trip.perHeadFare());
        assertEquals(135, trip.perHeadFare());
    }

    @Test
    void canTakeTripSedan() {
        Trip trip = new Trip(VehicleType.SEDAN, 10, 100, 4);
        assertTrue(trip.canTakeTrip());
    }

    @Test
    void canTakeTripSevenSeater() {
        Trip trip = new Trip(VehicleType.SEVEN_SEATER, 5, 60, 2);
        assertFalse(trip.canTakeTrip());

        Trip trip2 = new Trip(VehicleType.SEVEN_SEATER, 12, 60, 5);
        assertTrue(trip2.canTakeTrip());
    }

    @Test
    void canTakeTripMotorBike() {
        Trip trip = new Trip(VehicleType.SEDAN, 10, 100, 4);
        assertTrue(trip.canTakeTrip());
    }
}