package service;
import org.example.Order;

public class KitchenService {
    public void prepareFood(Order order) {
        System.out.println(" We are preparing the order " + order.getOrderId() + " for " + order.getCustomerName());
        order.setStatus("Cooking");
    }
    public void finishCooking(Order order) {
        System.out.println("The order " + order.getOrderId() + " is ready!");
        order.setStatus("Ready");
    }

}
