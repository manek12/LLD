package examples.elevatorSystem.model;

public class InternalButton {
    private final Elevator elevator;

    public InternalButton(Elevator elevator) {
        this.elevator = elevator;
    }

    public void press(int destinationFloor) {
        elevator.addRequest(destinationFloor);
    }
}
