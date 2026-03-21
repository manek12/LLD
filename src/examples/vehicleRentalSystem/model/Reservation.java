package examples.vehicleRentalSystem.model;

public class Reservation {
    private final String id;
    private final User user;
    private final Vehicle vehicle;
    private final Location pickupLocation;
    private final Location dropoffLocation;
    private final String pickupDate;
    private final String dropoffDate;
    private final ReservationStatus reservationStatus;
    private final Bill bill;

    private Reservation(Builder builder){
        this.id = builder.id;
        this.user = builder.user;
        this.vehicle = builder.vehicle;
        this.pickupLocation = builder.pickupLocation;
        this.dropoffLocation = builder.dropoffLocation;
        this.pickupDate = builder.pickupDate;
        this.dropoffDate = builder.dropoffDate;
        this.reservationStatus = builder.reservationStatus;
        this.bill = builder.bill;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public Location getDropoffLocation() {
        return dropoffLocation;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public String getDropoffDate() {
        return dropoffDate;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public Bill getBill() {
        return bill;
    }

    public static class Builder{
        private String id;
        private User user;
        private Vehicle vehicle;
        private Location pickupLocation;
        private Location dropoffLocation;
        private String pickupDate;
        private String dropoffDate;
        private ReservationStatus reservationStatus;
        private Bill bill;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public Builder setPickupLocation(Location pickupLocation) {
            this.pickupLocation = pickupLocation;
            return this;
        }

        public Builder setDropoffLocation(Location dropoffLocation) {
            this.dropoffLocation = dropoffLocation;
            return this;
        }

        public Builder setPickupDate(String pickupDate) {
            this.pickupDate = pickupDate;
            return this;
        }

        public Builder setDropoffDate(String dropoffDate) {
            this.dropoffDate = dropoffDate;
            return this;
        }

        public Builder setReservationStatus(ReservationStatus reservationStatus) {
            this.reservationStatus = reservationStatus;
            return this;
        }

        public Builder setBill(Bill bill) {
            this.bill = bill;
            return this;
        }

        public Reservation build(){
            return new Reservation(this);
        }
    }
}
