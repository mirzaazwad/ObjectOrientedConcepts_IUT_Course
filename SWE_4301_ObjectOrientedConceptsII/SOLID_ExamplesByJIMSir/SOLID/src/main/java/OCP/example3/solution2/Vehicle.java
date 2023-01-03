package OCP.example3.solution2;

/**
 * Created by jubair.
 * Date: 21/9/22
 * Time: 9:41 AM
 */

public abstract class Vehicle {
    protected  int distanceKM;
    protected  int timeMinutes;
    protected  int numberOfPassengers;

    public Vehicle(int distanceKM, int timeMinutes, int numberOfPassengers){
        this.distanceKM = distanceKM;
        this.numberOfPassengers = numberOfPassengers;
        this.timeMinutes = timeMinutes;
    }

    public abstract int perHeadFare();

    public void something(){
        System.out.println("Nothing");
    }
}
