package ParkingLot;
import java.util.*;
public class ParkingLot {
    private static ParkingLot instance;
    private List<ParkingFloor> floors = new ArrayList<>();

    private ParkingLot() {}

    public static synchronized ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public ParkingTicket parkVehicle(VehicleHierarchy vehicle) {
        for (ParkingFloor floor : floors) {
            ParkingSpot spot = floor.getAvailableSpot(vehicle);
            if (spot != null) {
                spot.assignVehicle();
                return new ParkingTicket(vehicle, spot);
            }
        }
        return null;
    }


}
