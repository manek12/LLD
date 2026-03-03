package examples.parkingLot;

import examples.parkingLot.models.Ticket;
import examples.parkingLot.util.CostCalculator;

public class Exit {

    private final CostCalculator costCalculator;
    private final Ticket ticket;
    private final ParkingManager parkingManager;

    public Exit(ParkingManager parkingManager, Ticket ticket) {
        this.parkingManager = parkingManager;
        this.ticket = ticket;
        this.costCalculator = new CostCalculator();
    }

    public void processExit() {
        System.out.println("Processing exit for ticket: " + ticket.getTicketId());
        System.out.println("Calculating parking cost for ticket: " + ticket.getTicketId());
        int cost = costCalculator.getCost(ticket);
        System.out.println("Parking cost for ticket: " + ticket.getTicketId() + " is: " + cost);

        parkingManager.unParkVehicle(ticket);
    }
}
