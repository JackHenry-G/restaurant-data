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

        List<Restaurant> restaurants = restTemplate.getForObject(url, ApiResponse.class).getRestaurants();

        // get a list of 10 restaurants only, or less
        List<Restaurant> shortenedListOfRestaurants = restaurants.size() > 10 ? restaurants.subList(0, 10)
                : restaurants;
        return shortenedListOfRestaurants;

    }
}
