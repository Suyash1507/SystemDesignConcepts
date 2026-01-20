package ParkingLot;

public class ParkingLotDemo {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();

        ParkingFloor floor1 = new ParkingFloor("F1");
        ParkingFloor floor2 = new ParkingFloor("F2");

        floor1.addSpot(new BikeSpot());
        floor1.addSpot(new CompactSpot());
        floor1.addSpot(new LargeSpot());
        floor1.addSpot(new CompactSpot());

        floor2.addSpot(new BikeSpot());
        floor2.addSpot(new CompactSpot());
        floor2.addSpot(new LargeSpot());

        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);

        VehicleHierarchy bike = new Bike("BIKE123");
        VehicleHierarchy car = new Car("CAR456");
        VehicleHierarchy truck = new Truck("TRUCK789");

        ParkingTicket bikeTicket = parkingLot.parkVehicle(bike);
        ParkingTicket carTicket = parkingLot.parkVehicle(car);
        ParkingTicket truckTicket = parkingLot.parkVehicle(truck);

//        System.out.println("Bike Ticket ID: " + (bikeTicket != null ? bikeTicket.getTicketId() : "No Spot Available"));
//        System.out.println("Car Ticket ID: " + (carTicket != null ? carTicket.getTicketId() : "No Spot Available"));
//        System.out.println("Truck Ticket ID: " + (truckTicket != null ? truckTicket.getTicketId() : "No Spot Available"));


        System.out.println(bike != null ? "Bike parked. Ticket: " + bikeTicket.getTicketId() : "Bike not parked");
        System.out.println(car != null ? "Car parked. Ticket: " + carTicket.getTicketId() : "Car not parked");
        System.out.println(truck != null ? "Truck parked. Ticket: " + truckTicket.getTicketId() : "Truck not parked");
    }

}

