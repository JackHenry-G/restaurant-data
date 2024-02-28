package com.goggin.restaurantdata.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.goggin.restaurantdata.Model.Restaurant;
import com.goggin.restaurantdata.Service.RestaurantService;

@Controller
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping // e.g. http://localhost:8080/restaurants?postcode=EC4M7RF
    public String getRestaurantsByPostcode(@RequestParam(name = "postcode") String postcode, Model model) {
        List<Restaurant> restaurants = restaurantService.findRestaurantsByPostcode(postcode);

        model.addAttribute("restaurants", restaurants);
        return "restaurants";
    }

}