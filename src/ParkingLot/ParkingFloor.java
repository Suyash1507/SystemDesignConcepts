package ParkingLot;
import java.util.*;

public class ParkingFloor {
    private String floorNumber;
    private List<ParkingSpot> spots= new ArrayList<>();

    public ParkingFloor(String floorNumber){
        this.floorNumber = floorNumber;
    }

    public void addSpot(ParkingSpot spot){
        spots.add(spot);
    }

    public ParkingSpot getAvailableSpot(VehicleHierarchy vehicle){
        for(ParkingSpot spot: spots){
            if(spot.isFree() && canFit(spot, vehicle)){
                return spot;
            }
        }
        return null;
    }

    public boolean canFit(ParkingSpot spot, VehicleHierarchy vehicle){
        if (vehicle.getType() == VehicleType.BIKE) {
            return spot.getType() == ParkingSpotType.BIKE;
        } else if (vehicle.getType() == VehicleType.CAR) {
            return spot.getType() == ParkingSpotType.COMPACT;
        } else if (vehicle.getType() == VehicleType.TRUCK) {
            return spot.getType() == ParkingSpotType.LARGE;
        } else {
            return false;
        }
    }

    public String getFloorNumber() {
        return floorNumber;
    }
}
