package OCP.example3.solution;

/**
 * Created by jubair.
 * Date: 8/9/22
 * Time: 11:15 AM
 */

public class Sedan extends Vehicle implements IVehicle{
    public Sedan(int distanceKM, int timeMinutes, int numberOfPassengers){
        super(distanceKM, timeMinutes, numberOfPassengers);
    }

    @Override
    public int perHeadFare() {
        int fare = (50 + distanceKM * 30 + timeMinutes * 2) / numberOfPassengers;

        return fare - (fare % 5);
    }

    @Override
    public boolean canTakeTrip() {
        if (numberOfPassengers < 1)
            return false;
        return numberOfPassengers <= 4 && distanceKM <= 25;
    }
}
