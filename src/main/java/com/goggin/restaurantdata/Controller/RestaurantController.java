package com.goggin.restaurantdata.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goggin.restaurantdata.Model.Restaurant;
import com.goggin.restaurantdata.Service.RestaurantService;

@Controller
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public String getRestaurants(Model model) {
        String test_postcode = "EC4M7RF";

        List<Restaurant> restaurants = restaurantService.findRestaurantsByPostcode(test_postcode);
        for (Restaurant restaurant : restaurants) {
            System.out.println("Restaurant: " + restaurant);
        }

        model.addAttribute("restaurants", restaurants);
        return "restaurant";
    }

}
