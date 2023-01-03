package OCP.example3.solution;

/**
 * Created by jubair.
 * Date: 21/9/22
 * Time: 12:51 AM
 */

public class SevenSeater extends Vehicle implements IVehicle{
    public SevenSeater(int distanceKM, int timeMinutes, int numberOfPassengers){
        super(distanceKM, timeMinutes, numberOfPassengers);
    }

    @Override
    public int perHeadFare() {
        int fare;
        if( distanceKM < 10){
            fare = 300/ numberOfPassengers;
        } else{
            fare = distanceKM * 30 / numberOfPassengers;
        }
        return fare - (fare % 5);
    }

    @Override
    public boolean canTakeTrip() {
        return numberOfPassengers <= 7 && distanceKM >= 10;
    }
}
