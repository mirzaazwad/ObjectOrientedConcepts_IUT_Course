package Lab07.VehicleProblemSolutionFactoryMethod;



public class Trip {
    public IVehicle vehicle;
    public Trip(VehicleType vehicleType, int numberOfPassengers, int distanceKM, int timeMinutes) {
        VehicleFactory choose=new VehicleFactory();
        this.vehicle=choose.chooseVehicleType(vehicleType,numberOfPassengers,distanceKM,timeMinutes);
    }

    public int perHeadFare(){
        return this.vehicle.perHeadFare();
    }

    public boolean canTakeTrip(){
        return this.vehicle.canTakeTrip();
    }
}
