import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.OrderService;

public class Main {

    public static void main(String[] args) {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

            OrderService orderService = context.getBean(OrderService.class);

            orderService.placeOrder("5", "Anna", "Pizza");

            orderService.cancelOrder("5");

            context.close();
        }
    }