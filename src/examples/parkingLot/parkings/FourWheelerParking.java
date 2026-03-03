package examples.parkingLot.parkings;

import examples.parkingLot.models.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParking implements ParkingType {

    private final List<ParkingSpot> parkingSpots;

    public FourWheelerParking(int capacity) {
        parkingSpots = new ArrayList<>();
        for (int i = 1; i <= capacity; i++) {
            parkingSpots.add(new ParkingSpot("4W" + i));
        }
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}
