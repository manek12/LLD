package examples.parkingLot.models;

public class ParkingSpot {
    private final String spotId;
    private Vehicle vehicle;
    private boolean isOccupied;

    public ParkingSpot(String spotId) {
        this.spotId = spotId;
        this.isOccupied = false;
    }

    public String getSpotId() {
        return spotId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void occupySpot(Vehicle vehicle) {
        this.vehicle = vehicle;
        isOccupied = true;
    }

    public void vacateSpot() {
        this.vehicle = null;
        isOccupied = false;
    }
}
