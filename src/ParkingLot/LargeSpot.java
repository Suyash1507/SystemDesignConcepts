package ParkingLot;

public class LargeSpot extends ParkingSpot{

    @Override
    public ParkingSpotType getType() {
        return ParkingSpotType.LARGE;
    }
}
