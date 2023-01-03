package OCP.example3.solution2;

import OCP.example3.solution.*;

/**
 * Created by jubair.
 * Date: 10/10/22
 * Time: 9:43 PM
 */

public class VehicleFactory {
    public Vehicle getVehicle(VehicleType vehicleType, int distanceKM, int timeMinutes, int numberOfPassengers) {
            return new Sedan(distanceKM, timeMinutes, numberOfPassengers);
    }
}
