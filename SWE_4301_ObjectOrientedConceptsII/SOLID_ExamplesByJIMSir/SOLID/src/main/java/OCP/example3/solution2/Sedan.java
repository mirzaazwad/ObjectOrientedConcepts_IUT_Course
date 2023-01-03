package OCP.example3.solution2;

import OCP.example3.solution2.Vehicle;

/**
 * Created by jubair.
 * Date: 8/9/22
 * Time: 11:15 AM
 */

public class Sedan extends Vehicle {
    public Sedan(int distanceKM, int timeMinutes, int numberOfPassengers){
        super(distanceKM, timeMinutes, numberOfPassengers);
    }
    @Override
    public int perHeadFare() {
        int fare = (50 + distanceKM * 30 + timeMinutes * 2) / numberOfPassengers;

        return fare - (fare % 5);
    }
}
