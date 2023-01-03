package Lab07.VehicleProblemSolutionFactoryMethod;

public class Vehicle implements IVehicle{
    protected int numberOfPassengers,distanceKM,timeMinutes;
    public Vehicle(int numberOfPassengers,int distanceKM,int timeMinutes) {
        this.numberOfPassengers = numberOfPassengers;
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
    }

    public boolean canTakeTrip(){
        return numberOfPassengers <= 1 && distanceKM <= 10;
    }
    public int perHeadFare(){
        int fare=distanceKM<10 ? 300 / numberOfPassengers:distanceKM * 30 / numberOfPassengers;
        return fare-fare%5;
    }
}
