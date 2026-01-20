package ParkingLot;

enum VehicleType {
    BIKE,
    CAR,
    TRUCK
}

enum ParkingSpotType{
    BIKE,
    COMPACT,
    LARGE
}

abstract class VehicleHierarchy {

    protected  String vehicleNumber;
    protected VehicleType type;

    public VehicleHierarchy(String vehicleNumber, VehicleType type) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
    }

    public VehicleType getType(){
        return type;
    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }

}


class Bike extends VehicleHierarchy {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, VehicleType.BIKE);
    }
}

class Car extends VehicleHierarchy {

    public Car(String vehicleNumber) {
        super(vehicleNumber, VehicleType.CAR);
    }
}

class Truck extends VehicleHierarchy {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, VehicleType.TRUCK);
    }
}