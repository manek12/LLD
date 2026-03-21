package examples.vehicleRentalSystem.model;

public class User {
    private final String id;
    private final String name;
    private final String email;
    private final String mobileNo;
    private final String licenseNo;

    public User(String id, String name, String email, String mobileNo, String licenseNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.licenseNo = licenseNo;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }
}
