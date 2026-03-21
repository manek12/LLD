package examples.vehicleRentalSystem;

import examples.vehicleRentalSystem.model.*;

import java.util.ArrayList;
import java.util.List;

public class StoreManager {
    private final Store store;
    private final List<Reservation> reservations;

    public StoreManager(Store store) {
        this.store = store;
        this.reservations = new ArrayList<>();
    }

    public Store getStore() {
        return store;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void addVehicle(Vehicle vehicle) {
        store.getVehicles().add(vehicle);
    }

    public void removeVehicle(String vehicleId) {
        store.getVehicles().removeIf(vehicle -> vehicle.getId().equals(vehicleId));
    }

    public Reservation reserveVehicle(User user, String vehicleId, Location pickupLocation, Location dropoffLocation, String pickupDate, String dropoffDate) {
        if(user.getLicenseNo() == null || "".equals(user.getLicenseNo())){
            System.out.println("You don't have License to drive, So we can't book this vehicle for you!!!");
            return null;
        }
        Vehicle vehicle = store.getVehicles()
                .stream()
                .filter(v -> v.getId().equals(vehicleId) && v.getStatus() == VehicleStatus.ACTIVE)
                .findFirst()
                .orElse(null);

        if(vehicle == null){
            System.out.println("This Vehicle is not available at this moment!!!");
            return null;
        }

        Reservation reservation = new Reservation.Builder().setId("resv-" + System.currentTimeMillis())
                .setVehicle(vehicle)
                .setUser(user)
                .setPickupLocation(pickupLocation)
                .setDropoffLocation(dropoffLocation)
                .setPickupDate(pickupDate)
                .setDropoffDate(dropoffDate)
                .setReservationStatus(ReservationStatus.SCHEDULED)
                .setBill(BillManager.generateBill(vehicle, pickupDate, dropoffDate))
                .build();

        reservations.add(reservation);
        return reservation;
    }

}
