package examples.parkingLot.util;

import examples.parkingLot.factories.PricingStrategyFactory;
import examples.parkingLot.models.Ticket;
import examples.parkingLot.strategies.PricingStrategy;

public class CostCalculator {

    public int getCost(Ticket ticket) {
        PricingStrategy pricingStrategy = PricingStrategyFactory.getPricingStrategy(ticket.getVehicle().getVehicleType());
        return pricingStrategy.calculatePrice(ticket);
    }
}
