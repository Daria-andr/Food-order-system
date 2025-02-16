package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.KitchenService;
import service.NotificationService;
import service.OrderService;
import service.RecommendationService;

@Configuration
public class AppConfig {

    @Bean
    public KitchenService kitchenService() {
        return new KitchenService();
    }

    @Bean
    public NotificationService notificationService() {
        return new NotificationService();
    }

    @Bean
    public RecommendationService recommendationService() {
        return new RecommendationService();
    }

    @Bean
    public OrderService orderService(KitchenService kitchenService,
                                     NotificationService notificationService,
                                     RecommendationService recommendationService) {
        return new OrderService(kitchenService, notificationService, recommendationService);
    }
}

