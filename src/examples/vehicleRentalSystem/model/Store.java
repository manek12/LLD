package examples.vehicleRentalSystem.model;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final String storeId;
    private final String name;
    private final Location location;
    private final String contactNumber;
    private final List<Vehicle> vehicles;

    public Store(String storeId, String name, Location location, String contactNumber) {
        this.storeId = storeId;
        this.name = name;
        this.location = location;
        this.contactNumber = contactNumber;
        vehicles = new ArrayList<>();
    }

    public String getStoreId() {
        return storeId;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
