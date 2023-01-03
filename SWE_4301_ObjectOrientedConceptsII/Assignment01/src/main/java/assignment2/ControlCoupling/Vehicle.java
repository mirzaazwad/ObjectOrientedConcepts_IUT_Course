package assignment2.ControlCoupling;

public class Vehicle {
    int numberOfWheels;
    public Vehicle(int type){
        switch(type){
            case 1:
                Truck truck=new Truck();
                this.numberOfWheels= truck.numberOfWheels;
                break;
            case 2:
                Car car=new Car();
                this.numberOfWheels=car.numberOfWheels;
                break;
            case 3:
                Motorbike bike=new Motorbike();
                this.numberOfWheels=bike.numberOfWheels;
                break;
            default:
                this.numberOfWheels=-1;
        }
    }

    public int vehicleNumberOfWheels(){
        return this.numberOfWheels;
    }
}
