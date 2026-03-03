package examples.parkingLot.factories;

import examples.parkingLot.models.VehicleType;
import examples.parkingLot.strategies.HourlyPricingStrategy;
import examples.parkingLot.strategies.MinutelyPricingStrategy;
import examples.parkingLot.strategies.PricingStrategy;

public class PricingStrategyFactory {

    public static PricingStrategy getPricingStrategy(VehicleType vehicleType) {
        if (VehicleType.FOUR_WHEELER.equals(vehicleType)) {
            return new MinutelyPricingStrategy();
        } else if (VehicleType.TWO_WHEELER.equals(vehicleType)) {
            return new HourlyPricingStrategy();
        } else {
            throw new IllegalArgumentException("Invalid vehicle type: " + vehicleType);
        }
    }
}
