package com.goggin.restaurantdata.Model;

import java.util.List;

public class ApiResponse {
    private List<Restaurant> restaurants; // Use a more specific type if you know the structure of a restaurant

    // Getters and setters
    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
