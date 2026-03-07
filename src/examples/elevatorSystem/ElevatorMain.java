package examples.elevatorSystem;

import examples.elevatorSystem.model.*;
import examples.elevatorSystem.strategy.AssigningStrategy;
import examples.elevatorSystem.strategy.OddEvenStrategy;

import java.util.ArrayList;
import java.util.List;

public class ElevatorMain {

    public static void main(String[] args) {
        List<Elevator> elevators = List.of(new Elevator(1), new Elevator(2));
        AssigningStrategy assigningStrategy = new OddEvenStrategy();
        ElevatorController controller = new ElevatorController(elevators, assigningStrategy);

        List<Floor> floors = new ArrayList<>();
        floors.add(new Floor(1, new ExternalButton(controller)));
        floors.add(new Floor(2, new ExternalButton(controller)));
        floors.add(new Floor(3, new ExternalButton(controller)));
        floors.add(new Floor(4, new ExternalButton(controller)));
        floors.add(new Floor(5, new ExternalButton(controller)));
        floors.add(new Floor(6, new ExternalButton(controller)));

        floors.get(3).getExternalButton().press(2, 4, Direction.UP);
        floors.get(5).getExternalButton().press(5, 1, Direction.DOWN);

        for(Elevator elevator : elevators) {
            InternalButton internalButton = new InternalButton(elevator);
            internalButton.press(0);
            elevator.move();
        }
    }
}
