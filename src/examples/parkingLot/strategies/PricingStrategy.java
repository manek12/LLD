package examples.parkingLot.strategies;

import examples.parkingLot.models.Ticket;

public interface PricingStrategy {
    public int calculatePrice(Ticket ticket);
}
