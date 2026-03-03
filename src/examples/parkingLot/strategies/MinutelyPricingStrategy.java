package examples.parkingLot.strategies;

import examples.parkingLot.models.Ticket;

public class MinutelyPricingStrategy implements PricingStrategy{

    private final int minutelyRate = 1;

    @Override
    public int calculatePrice(Ticket ticket) {
        return minutelyRate * (int) Math.ceil((System.currentTimeMillis() - ticket.getEntryTime()) / (1000.0 * 60));
    }
}
