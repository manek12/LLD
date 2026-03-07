package examples.elevatorSystem.strategy;

import examples.elevatorSystem.model.Direction;
import examples.elevatorSystem.model.Elevator;
import examples.elevatorSystem.model.ExternalRequest;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NearestElevatorStrategy implements AssigningStrategy {

    @Override
    public Elevator assignElevator(ExternalRequest request, List<Elevator> elevators) {

        Comparator<Elevator> comparator =
                Comparator.comparingInt(
                        e -> Math.abs(e.getCurrentFloor() - request.getFloorNumber())
                );

        Optional<Elevator> preferred = elevators.stream()
                .filter(elevator ->
                        elevator.isIdle() ||
                                (elevator.getDirection() == Direction.UP &&
                                        request.getFloorNumber() >= elevator.getCurrentFloor()) ||
                                (elevator.getDirection() == Direction.DOWN &&
                                        request.getFloorNumber() <= elevator.getCurrentFloor())
                )
                .min(comparator);

        return preferred.orElseGet(() ->
                elevators.stream().min(comparator).orElse(null)
        );
    }
}
