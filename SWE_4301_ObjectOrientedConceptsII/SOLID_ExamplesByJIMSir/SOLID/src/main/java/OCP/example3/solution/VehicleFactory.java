package OCP.example3.solution;

import OCP.example3.solution.VehicleType;

/**
 * Created by jubair.
 * Date: 10/10/22
 * Time: 9:43 PM
 */

public class VehicleFactory {
    public IVehicle getVehicle(VehicleType vehicleType, int distanceKM, int timeMinutes, int numberOfPassengers) {
        if(vehicleType.equals(VehicleType.SEDAN))
            return new Sedan(distanceKM, timeMinutes, numberOfPassengers);
        else if(vehicleType.equals(VehicleType.SEVEN_SEATER))
            return new SevenSeater(distanceKM, timeMinutes, numberOfPassengers);
        else return new MotorBike(distanceKM, timeMinutes, numberOfPassengers);
    }
}
