package examples.elevatorSystem;

import examples.elevatorSystem.model.Elevator;
import examples.elevatorSystem.model.ExternalRequest;
import examples.elevatorSystem.strategy.AssigningStrategy;

import java.util.List;

public class ElevatorController {
    private final List<Elevator> elevators;
    private final AssigningStrategy assigningStrategy;

    public ElevatorController(List<Elevator> elevators, AssigningStrategy assigningStrategy) {
        this.elevators = elevators;
        this.assigningStrategy = assigningStrategy;
    }

    public void requestElevator(ExternalRequest request, int destinationFloor) {
        Elevator assignedElevator = assigningStrategy.assignElevator(request, elevators);
        if (assignedElevator != null) {
            assignedElevator.addRequest(destinationFloor);
        } else {
            System.out.println("No available elevator for request at floor " + request.getFloorNumber());
        }
    }
}
