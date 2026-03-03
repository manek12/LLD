package examples.parkingLot;


import examples.parkingLot.models.ParkingSpot;
import examples.parkingLot.models.Ticket;
import examples.parkingLot.models.VehicleType;
import examples.parkingLot.parkings.Parking;

public class ParkingManager {
    Parking parking;

    public ParkingManager(Parking parking) {
        this.parking = parking;
    }

    public void addParkingSpot(String spotId, VehicleType vehicleType) {
        parking.getParkingSpots(vehicleType).add(new ParkingSpot(spotId));
    }

    public void removeParkingSpot(String spotId, VehicleType vehicleType) {
        parking.getParkingSpots(vehicleType).removeIf(parkingSpot -> parkingSpot.getSpotId().equals(spotId));
    }

    public ParkingSpot findAvailableSpot(VehicleType vehicleType) {
        return parking.getParkingSpots(vehicleType).stream().filter(parkingSpot -> !parkingSpot.isOccupied()).findFirst().orElse(null);
    }

    public void parkVehicle(Ticket ticket) {
        parking.getParkingSpots(ticket.getVehicle().getVehicleType()).stream()
                .filter(parkingSpot -> parkingSpot.getSpotId().equals(ticket.getParkingSpot().getSpotId()))
                .findFirst()
                .ifPresent(parkingSpot -> parkingSpot.occupySpot(ticket.getVehicle()));
    }

    public void unParkVehicle(Ticket ticket) {
        parking.getParkingSpots(ticket.getVehicle().getVehicleType()).stream().filter(parkingSpot -> parkingSpot.getSpotId().equals(ticket.getParkingSpot().getSpotId()))
                .findFirst().ifPresent(ParkingSpot::vacateSpot);
    }
}
