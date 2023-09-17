package com.sha.Restaurant.repo;

import com.sha.Restaurant.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Configuration
public class DataSource {
    @Bean
    Map<Integer , Restaurant> getRestaurantSource(){
        return new HashMap<>();
    }
}

