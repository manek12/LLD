package examples.vehicleRentalSystem.model;

public class Bill {
    private final String billId;
    private final double amount;
    private final String billingDate;
    private boolean isPaid;
    private Payment payment;

    public Bill(String billId, double amount, String billingDate) {
        this.billId = billId;
        this.amount = amount;
        this.billingDate = billingDate;
        this.isPaid = false;
    }

    public String getBillId() {
        return billId;
    }

    public double getAmount() {
        return amount;
    }

    public String getBillingDate() {
        return billingDate;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void markAsPaid() {
        this.isPaid = true;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
