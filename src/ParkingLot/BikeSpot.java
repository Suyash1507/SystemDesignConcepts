package ParkingLot;

public class BikeSpot extends ParkingSpot{

    @Override
    public ParkingSpotType getType() {
        return ParkingSpotType.BIKE;
    }
}
