package ParkingLot;

public class ParkingTicket {
    private String ticketId;
    private long entryTime;
    private VehicleHierarchy vehicle;
    private ParkingSpot parkingSpot;

    public ParkingTicket(VehicleHierarchy vehicle, ParkingSpot parkingSpot) {
        this.ticketId = ticketId;
        this.entryTime = System.currentTimeMillis();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public String getTicketId() {
        return ticketId;
    }

    public VehicleHierarchy getVehicle() {
        return vehicle;
    }

}
