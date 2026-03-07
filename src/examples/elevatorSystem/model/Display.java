package examples.elevatorSystem.model;

public class Display {
    private int currentFloor;
    private Direction direction;

    public Display() {
        this.currentFloor = 0;
        this.direction = Direction.IDLE;
    }

    public void updateDisplay(int currentFloor, Direction direction) {
        this.currentFloor = currentFloor;
        this.direction = direction;
        showDisplay();
    }

    private void showDisplay() {
        System.out.println("Current Floor: " + currentFloor + " | " + "Direction: " + direction);
    }
}
