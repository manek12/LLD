package examples.elevatorSystem.model;

import examples.elevatorSystem.ElevatorController;

public class ExternalButton {
    private final ElevatorController elevatorController;

    public ExternalButton(ElevatorController elevatorController) {
        this.elevatorController = elevatorController;
    }

    public void press(int currentFloor, int destinationFloor, Direction direction) {
        ExternalRequest request = new ExternalRequest(currentFloor, direction);
        elevatorController.requestElevator(request, destinationFloor);
    }
}
