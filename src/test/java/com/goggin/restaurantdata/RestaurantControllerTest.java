package com.goggin.restaurantdata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import com.goggin.restaurantdata.Controller.RestaurantController;
import com.goggin.restaurantdata.Service.RestaurantService;

@WebMvcTest(RestaurantController.class)
public class RestaurantControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RestaurantService restaurantService;

    @Test
    @DisplayName("Should return 200 and html page for restaurants by postcode")
    public void getRestaurantsByPostcodeTest() throws Exception {
        this.mockMvc.perform(get("/restaurants?postcode=EC4M7RF"))
                .andExpect(status().isOk())
                .andExpect(view().name("restaurants"));
    }

    @Test
    @DisplayName("Should return 400, when going to endpoint not configured on server")
    public void getRestaurants() throws Exception {
        this.mockMvc.perform(get("/restaurants"))
                .andExpect(status().isBadRequest());
    }

}
