package examples.elevatorSystem.model;

public class Floor {
    private final int floorNumber;
    private final ExternalButton externalButton;

    public Floor(int floorNumber, ExternalButton externalButton) {
        this.floorNumber = floorNumber;
        this.externalButton = externalButton;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public ExternalButton getExternalButton() {
        return externalButton;
    }
}
