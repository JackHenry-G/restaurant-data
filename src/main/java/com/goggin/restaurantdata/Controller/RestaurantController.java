package com.goggin.restaurantdata.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {

    @GetMapping
    public String getRestaurants() {
        return "restaurant";
    }

}
