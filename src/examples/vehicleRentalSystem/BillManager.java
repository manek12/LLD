package examples.vehicleRentalSystem;

import examples.vehicleRentalSystem.model.Bill;
import examples.vehicleRentalSystem.model.Vehicle;
import examples.vehicleRentalSystem.model.VehicleType;

public class BillManager {

    public static Bill generateBill(Vehicle vehicle, String pickupDate, String dropoffDate) {
        int hours = calculateHours(pickupDate, dropoffDate);
        double amount = 0;
        if(vehicle.getType() == VehicleType.BIKE){
            amount = hours * 5; // $5 per hour for bikes
        }
        else{
            amount = hours * 20; // $20 per hour for cars
        }
        return new Bill("bill-" + System.currentTimeMillis(), amount, pickupDate);
    }

    private static int calculateHours(String pickupDate, String dropoffDate) {
        String format = "yyyy-MM-dd HH:mm";
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(format);
            java.util.Date pickup = sdf.parse(pickupDate);
            java.util.Date dropoff = sdf.parse(dropoffDate);
            long diffInMillies = Math.abs(dropoff.getTime() - pickup.getTime());
            return (int) (diffInMillies / (1000 * 60 * 60));
        } catch (java.text.ParseException e) {
            throw new IllegalArgumentException("Invalid date format. Expected format: " + format);
        }
    }
}
