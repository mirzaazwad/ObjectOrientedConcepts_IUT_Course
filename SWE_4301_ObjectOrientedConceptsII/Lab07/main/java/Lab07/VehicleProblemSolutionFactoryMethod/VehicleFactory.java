package Lab07.VehicleProblemSolutionFactoryMethod;

import Lab07.MastersProgramSolutionFactoryMethod.*;

public class VehicleFactory {
    IVehicle vehicle;
    public IVehicle chooseVehicleType(VehicleType type, int numberOfPassengers,int distanceKM,int timeMinutes){
        if(type.equals(VehicleType.SEDAN)){
            vehicle=new Sedan(numberOfPassengers,distanceKM,timeMinutes);
        }
        else if(type.equals(VehicleType.MOTOR_BIKE)){
            vehicle=new Motorbike(numberOfPassengers,distanceKM,timeMinutes);
        }
        else if(type.equals(VehicleType.SEVEN_SEATER)){
            vehicle=new SevenSeater(numberOfPassengers,distanceKM,timeMinutes);
        }
        return vehicle;
    }
}

