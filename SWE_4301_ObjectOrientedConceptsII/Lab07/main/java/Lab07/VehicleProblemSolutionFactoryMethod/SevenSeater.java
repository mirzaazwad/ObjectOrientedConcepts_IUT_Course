package Lab07.VehicleProblemSolutionFactoryMethod;

public class SevenSeater extends Vehicle{
    public SevenSeater(int numberOfPassengers,int distanceKM,int timeMinutes){
        super(numberOfPassengers,distanceKM,timeMinutes);
    }

    @Override
    public boolean canTakeTrip(){
        return numberOfPassengers <= 7 && distanceKM >= 10;
    }

    @Override
    public int perHeadFare(){
        int fare=distanceKM<10 ? 300 / numberOfPassengers:distanceKM * 30 / numberOfPassengers;
        return fare-fare%5;
    }
}
