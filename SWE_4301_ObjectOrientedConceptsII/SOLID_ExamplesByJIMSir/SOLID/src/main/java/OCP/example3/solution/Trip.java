package OCP.example3.solution;

/**
 * Created by jubair.
 * Date: 8/9/22
 * Time: 3:05 PM
 */

public class Trip {
    private IVehicle vehicle;

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

    public boolean canTakeTrip()
    {
        return this.vehicle.canTakeTrip();
    }
}
