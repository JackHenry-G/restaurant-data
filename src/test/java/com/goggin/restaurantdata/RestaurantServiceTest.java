package com.goggin.restaurantdata;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.goggin.restaurantdata.Model.Restaurant;
import com.goggin.restaurantdata.Service.RestaurantService;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class RestaurantServiceTest {

    @Mock
    private RestaurantService restaurantService;

    @Test
    @DisplayName("Given invalid postcode, expect empty list")
    public void test_getRestaurantsByPostcode_withInvalidPostcode_expectEmptyList() {
        // arrange
        String invalid_postcode = "-1"; // empty list will be retunred - "restaurants": [],
        when(restaurantService.findRestaurantsByPostcode(invalid_postcode)).thenReturn(Collections.emptyList());

        // act
        List<Restaurant> restaurants = restaurantService.findRestaurantsByPostcode(invalid_postcode);
        System.out.println(restaurants);

        // assert
        assertTrue(restaurants.isEmpty());
    }

    @Test
    @DisplayName("Given valid postcode, expect list of restaurants")
    public void test_getRestaurantsByPostcode_withInvalidPostcode_expectListOfRestaurants() {
        // arrange
        String valid_postcode = "EC4M7RF";
        List<Restaurant> mockRestaurants = List.of(new Restaurant()); // Assuming Restaurant is a valid object
        when(restaurantService.findRestaurantsByPostcode(valid_postcode)).thenReturn(mockRestaurants);

        // act
        List<Restaurant> restaurants = restaurantService.findRestaurantsByPostcode(valid_postcode);

        // assert
        assertNotNull(restaurants);
        assertFalse(restaurants.isEmpty());
        assertTrue(restaurants.size() > 0);
    }
}
