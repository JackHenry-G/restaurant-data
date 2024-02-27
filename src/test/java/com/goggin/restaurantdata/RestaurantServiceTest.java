package com.goggin.restaurantdata;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RestaurantServiceTest {

    @Test
    public void test_getRestaurantsByPostcode_withInvalidPostcode_expectException() {
        // arrange
        String invalid_postcode = "-1"; // empty list will be retunred - "restaurants": [],

        // act

        // asssert
    }

    @Test
    public void test_getRestaurantsByPostcode_withInvalidPostcode_expectListOfRestaurants() {
        // arrange
        String invalid_postcode = "EC4M7RF";

        // act

        // assert
    }
}
