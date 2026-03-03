package examples.parkingLot;

import examples.parkingLot.models.ParkingSpot;
import examples.parkingLot.models.Ticket;
import examples.parkingLot.models.Vehicle;

public class Entry {

    private ParkingManager parkingManager;
    private Vehicle vehicle;

    public Entry(ParkingManager parkingManager, Vehicle vehicle) {
        this.parkingManager = parkingManager;
        this.vehicle = vehicle;
    }

    public Ticket processEntry() {
        System.out.println("Finding empty spot for vehicle: " + vehicle.getVehicleNo());
        ParkingSpot spot = parkingManager.findAvailableSpot(vehicle.getVehicleType());
        if (spot == null) {
            System.out.println("No available spot for vehicle: " + vehicle.getVehicleNo());
            return null;
        }
        System.out.println("Found spot: " + spot.getSpotId() + " for vehicle: " + vehicle.getVehicleNo());
        System.out.println("Generating ticket for vehicle: " + vehicle.getVehicleNo());
        Ticket ticket = new Ticket("TICKET-" + System.currentTimeMillis(), vehicle, spot);
        System.out.println("Parking vehicle: " + vehicle.getVehicleNo() + " at spot: " + spot.getSpotId());
        parkingManager.parkVehicle(ticket);
        System.out.println("Vehicle: " + vehicle.getVehicleNo() + " parked successfully with ticket: " + ticket.getTicketId());

        return ticket;
    }
}
