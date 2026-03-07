package examples.elevatorSystem.model;

import java.util.PriorityQueue;

public class Elevator {
    private final int id;
    private int currentFloor;
    private Direction direction;
    private State state;
    private PriorityQueue<Integer> upQueue;
    private PriorityQueue<Integer> downQueue;
    private final Display display;

    public Elevator(int id) {
        this.id = id;
        this.currentFloor = 0;
        this.direction = Direction.IDLE;
        this.state = State.IDLE;
        this.upQueue = new PriorityQueue<>();
        this.downQueue = new PriorityQueue<>((a, b) -> b - a);
        this.display = new Display();
    }

    public void addRequest(int floor) {
        if (floor > currentFloor) {
            upQueue.offer(floor);
        } else if (floor < currentFloor) {
            downQueue.offer(floor);
        }
    }

    public void move(){
        if(!upQueue.isEmpty()){
            currentFloor = upQueue.poll();
            direction = Direction.UP;
            state = State.MOVING;
        } else if(!downQueue.isEmpty()){
            currentFloor = downQueue.poll();
            direction = Direction.DOWN;
            state = State.MOVING;
        } else {
            direction = Direction.IDLE;
            state = State.IDLE;
        }
        display.updateDisplay(currentFloor, direction);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

}
