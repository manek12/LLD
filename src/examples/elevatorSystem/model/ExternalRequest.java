package examples.elevatorSystem.model;

public class ExternalRequest {
    private final int floorNumber;
    private final Direction direction;

    public ExternalRequest(int floorNumber, Direction direction) {
        this.floorNumber = floorNumber;
        this.direction = direction;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Direction getDirection() {
        return direction;
    }
}
