package examples.elevatorSystem.strategy;

import examples.elevatorSystem.model.Elevator;
import examples.elevatorSystem.model.ExternalRequest;

import java.util.List;

public interface AssigningStrategy {
    Elevator assignElevator(ExternalRequest request, List<Elevator> elevators);
}
