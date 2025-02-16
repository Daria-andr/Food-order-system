package service;

import model.Order;

public class NotificationService {
    public void notifyCustomer(Order order) {
        System.out.println("Notification: " + order.getCustomerName() +
                ", your order " + order.getOrderId() +
                " is ready, Status: " + order.getStatus());
    }
}
