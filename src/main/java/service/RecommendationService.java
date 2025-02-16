package service;

import java.util.HashMap;
import java.util.Map;

public class RecommendationService {
    private final Map<String, String> recommendations = new HashMap<>();
    public RecommendationService() {
        recommendations.put("Pizza", "Coca");
        recommendations.put("Burger", "French fries");
    }

    public String getRecommendation(String mainDish) {
        return recommendations.getOrDefault(mainDish, "No recommendation found for " + mainDish);
    }
}
