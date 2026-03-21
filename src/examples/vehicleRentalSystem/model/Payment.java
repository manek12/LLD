package examples.vehicleRentalSystem.model;

public class Payment {
    private final String paymentId;
    private final double amount;
    private final String method;
    private final String paymentDate;

    public Payment(String paymentId, double amount, String method, String paymentDate) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.method = method;
        this.paymentDate = paymentDate;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }

    public String getPaymentDate() {
        return paymentDate;
    }
}
