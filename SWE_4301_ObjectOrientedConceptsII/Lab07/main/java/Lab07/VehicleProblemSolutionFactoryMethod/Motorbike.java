package Lab07.VehicleProblemSolutionFactoryMethod;

public class Motorbike extends Vehicle{
    public Motorbike(int numberOfPassengers,int distanceKM,int timeMinutes) {
        super(numberOfPassengers,distanceKM,timeMinutes);
    }
    @Override
    public boolean canTakeTrip(){
        return numberOfPassengers <= 1 && distanceKM <= 10;
    }
    @Override
    public int perHeadFare(){
        int fare=Math.max(25, distanceKM * 20) / numberOfPassengers;
        return fare-fare%5;
    }
}
