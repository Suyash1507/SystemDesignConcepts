package ParkingLot;

public class CompactSpot extends ParkingSpot{

    @Override
    public ParkingSpotType getType() {
        return ParkingSpotType.COMPACT;
    }
}
