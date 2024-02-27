package com.goggin.restaurantdata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import com.goggin.restaurantdata.Controller.RestaurantController;

@WebMvcTest(RestaurantController.class)
public class RestaurantControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getRestaurantsTest() throws Exception {
        this.mockMvc.perform(get("/restaurant"))
                .andExpect(status().isOk())
                .andExpect(view().name("restaurant"));
    }

}
