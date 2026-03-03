package examples.parkingLot.strategies;

import examples.parkingLot.models.Ticket;

public class HourlyPricingStrategy implements PricingStrategy {
    private final int hourlyRate = 50;

    @Override
    public int calculatePrice(Ticket ticket) {
        return hourlyRate * (int) Math.ceil((System.currentTimeMillis() - ticket.getEntryTime()) / (1000.0 * 60 * 60));
    }
}
