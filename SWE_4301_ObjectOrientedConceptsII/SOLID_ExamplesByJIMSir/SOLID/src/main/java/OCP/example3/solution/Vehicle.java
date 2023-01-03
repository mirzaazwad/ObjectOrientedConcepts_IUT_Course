package OCP.example3.solution;

/**
 * Created by jubair.
 * Date: 21/9/22
 * Time: 9:41 AM
 */

public class Vehicle {
    protected  int distanceKM;
    protected  int timeMinutes;
    protected  int numberOfPassengers;

    public Vehicle(int distanceKM, int timeMinutes, int numberOfPassengers){
        this.distanceKM = distanceKM;
        this.numberOfPassengers = numberOfPassengers;
        this.timeMinutes = timeMinutes;
    }
}
