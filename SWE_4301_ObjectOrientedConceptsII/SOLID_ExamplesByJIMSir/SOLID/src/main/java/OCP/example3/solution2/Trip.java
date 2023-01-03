package OCP.example3.solution2;

import OCP.example3.solution.VehicleType;

/**
 * Created by jubair.
 * Date: 8/9/22
 * Time: 3:05 PM
 */

public class Trip {
    private Vehicle vehicle;

    public Trip(VehicleType vehicleType,
                int distanceKM,
                int timeMinutes,
                int numberOfPassengers) {
        this.vehicle = new VehicleFactory().getVehicle(vehicleType, distanceKM, timeMinutes, numberOfPassengers);
    }

    public int perHeadFare()
    {
        return this.vehicle.perHeadFare();
    }

    public static void main(String[] args) {
        Trip trip = new Trip(VehicleType.SEDAN, 12, 45, 3);
        System.out.println(trip.perHeadFare());
    }
}
