package examples.parkingLot;

import examples.parkingLot.models.Ticket;
import examples.parkingLot.models.Vehicle;
import examples.parkingLot.models.VehicleType;
import examples.parkingLot.parkings.Parking;

public class ParkingLotMain {
    public static void main(String[] args) throws InterruptedException {
        Parking parking = new Parking();
        ParkingManager parkingManager = new ParkingManager(parking);

        Vehicle car = new Vehicle("KA-01-1234", VehicleType.FOUR_WHEELER);
        Vehicle bike = new Vehicle("KA-02-5678", VehicleType.TWO_WHEELER);

        Entry carEntry = new Entry(parkingManager, car);
        Ticket carTicket = carEntry.processEntry();
        Thread.sleep(2000);
        Exit carExit = new Exit(parkingManager, carTicket);
        carExit.processExit();

        System.out.println("-----------------------------------");

        Entry bikeEntry = new Entry(parkingManager, bike);
        Ticket bikeTicket = bikeEntry.processEntry();
        Thread.sleep(3000);
        Exit bikeExit = new Exit(parkingManager, bikeTicket);
        bikeExit.processExit();

    }
}
