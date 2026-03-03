package examples.parkingLot.parkings;

import examples.parkingLot.models.ParkingSpot;
import examples.parkingLot.models.VehicleType;

import java.util.List;
import java.util.Map;

public class Parking {
    Map<VehicleType, ParkingType> parking;

    public Parking(){
        parking = Map.of(
                VehicleType.TWO_WHEELER, new TwoWheelerParking(10),
                VehicleType.FOUR_WHEELER, new FourWheelerParking(20)
        );
    }

    public List<ParkingSpot> getParkingSpots(VehicleType vehicleType) {
        ParkingType parkingType = parking.get(vehicleType);
        if (parkingType == null) {
            throw new IllegalArgumentException("Invalid vehicle type: " + vehicleType);
        }
        return parkingType.getParkingSpots();
    }

}
