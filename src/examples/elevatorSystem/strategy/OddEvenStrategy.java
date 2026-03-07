package examples.elevatorSystem.strategy;

import examples.elevatorSystem.model.Elevator;
import examples.elevatorSystem.model.ExternalRequest;

import java.util.List;

public class OddEvenStrategy implements AssigningStrategy {

    @Override
    public Elevator assignElevator(ExternalRequest request, List<Elevator> elevators) {
        int floorNumber = request.getFloorNumber();
        for(Elevator elevator : elevators) {
            if (floorNumber % 2 == 0 && elevator.getCurrentFloor() % 2 == 0) {
                return elevator;
            } else if (floorNumber % 2 != 0 && elevator.getCurrentFloor() % 2 != 0) {
                return elevator;
            }
        }

        return elevators.get(0);
    }
}
