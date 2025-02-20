package service;
import model.Order;
import java.util.HashMap;
import java.util.Map;

public class OrderService {
    private final KitchenService kitchenService;
    private final NotificationService notificationService;
    private final RecommendationService recommendationService;
    private final Map<String, Order> orders = new HashMap<>();

    public OrderService(KitchenService kitchenService,
                        NotificationService notificationService,
                        RecommendationService recommendationService) {
        this.kitchenService = kitchenService;
        this.notificationService = notificationService;
        this.recommendationService = recommendationService;
    }

    public void placeOrder(String orderId, String customerName, String dish) {
        if (customerName == null || customerName.isBlank()) {
            throw new IllegalArgumentException("Customer name cannot be empty!");
        }

        Order order = new Order(orderId, customerName);
        orders.put(orderId, order);
        System.out.println(" New order: " + order);
        kitchenService.prepareFood(order);

        String recommendation = recommendationService.getRecommendation(dish);
        System.out.println(" Try : " + recommendation + " with your order!");

        kitchenService.finishCooking(order);
        notificationService.notifyCustomer(order);
    }

    public void cancelOrder(String orderId) {
        if (orders.containsKey(orderId)) {
            orders.remove(orderId);
            System.out.println("The order " + orderId + " is canceled!");
        }
    }
}
