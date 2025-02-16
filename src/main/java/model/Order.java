package model;

public class Order {
    private final String orderId;
    private final String customerName;
    private String status;

    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.status = "Pending";
    }

    public String getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Order{" + "ID='" + orderId + '\'' +
                ", Customer='" + customerName + '\'' +
                ", Status='" + status + '\'' + '}';
    }
}
