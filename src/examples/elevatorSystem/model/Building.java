package examples.elevatorSystem.model;

import java.util.List;

public class Building {
    private final List<Floor> floors;
    private final List<Elevator> elevators;

    public Building(List<Floor> floors, List<Elevator> elevators) {
        this.floors = floors;
        this.elevators = elevators;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public List<Elevator> getElevators() {
        return elevators;
    }
}
