package ParkingLot;

abstract class ParkingSpot {
    protected int id;
    protected boolean isFree = true;

    public boolean isFree(){
        return isFree;
    }
    public void assignVehicle(){
        isFree = false;
    }
    public void removeVehicle(){
        isFree = true;
    }
    public abstract ParkingSpotType getType();
}

