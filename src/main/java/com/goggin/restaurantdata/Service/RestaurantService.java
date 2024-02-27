package com.goggin.restaurantdata.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.goggin.restaurantdata.Model.ApiResponse;
import com.goggin.restaurantdata.Model.Restaurant;

@Service
public class RestaurantService {

    public List<Restaurant> findRestaurantsByPostcode(String postcode) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://uk.api.just-eat.io/discovery/uk/restaurants/enriched/bypostcode/" + postcode;
        return restTemplate.getForObject(url, ApiResponse.class).getRestaurants();
    }
}
