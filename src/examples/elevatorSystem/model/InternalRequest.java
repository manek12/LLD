package examples.elevatorSystem.model;

public class InternalRequest {
    private final int floorNumber;

    public InternalRequest(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
