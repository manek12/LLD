package examples.vehicleRentalSystem.model;

public class Vehicle {
    private final String id;
    private final String vehicleBrand;
    private final String model;
    private final int year;
    private final String licensePlate;
    private final VehicleType type;
    private final VehicleStatus status;

    private Vehicle(Builder builder){
        this.id = builder.id;
        this.vehicleBrand = builder.vehicleBrand;
        this.model = builder.model;
        this.year = builder.year;
        this.licensePlate = builder.licensePlate;
        this.type = builder.type;
        this.status = builder.status;
    }

    public String getId() {
        return id;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getType() {
        return type;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public static class Builder{
        private String id;
        private String vehicleBrand;
        private String model;
        private int year;
        private String licensePlate;
        private VehicleType type;
        private VehicleStatus status;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setVehicleBrand(String vehicleBrand) {
            this.vehicleBrand = vehicleBrand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
            return this;
        }

        public Builder setType(VehicleType type) {
            this.type = type;
            return this;
        }

        public Builder setStatus(VehicleStatus status) {
            this.status = status;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}
