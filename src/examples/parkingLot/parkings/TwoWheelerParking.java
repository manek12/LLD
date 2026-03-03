package examples.parkingLot.parkings;

import examples.parkingLot.models.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParking implements ParkingType {
    private final List<ParkingSpot> parkingSpots;

    public TwoWheelerParking(int capacity) {
        parkingSpots = new ArrayList<>();
        for (int i = 1; i <= capacity; i++) {
            parkingSpots.add(new ParkingSpot("2W" + i));
        }
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

}
