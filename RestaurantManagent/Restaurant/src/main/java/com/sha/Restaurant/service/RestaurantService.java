package com.sha.Restaurant.service;

import com.sha.Restaurant.entity.Dishes;
import com.sha.Restaurant.entity.Restaurant;
import com.sha.Restaurant.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo ;

    public String addRestaurant(Restaurant restaurant) {
        restaurantRepo.getRestaurantMap().put(restaurant.getRestaurantID() ,restaurant);
        return "restaurant added";
    }

    public Map<Integer, Restaurant> getAllRestaurant() {
         return restaurantRepo.getRestaurantMap();
    }
    public List<Restaurant> getRestaurantBYId(Integer id) {
        List<Restaurant> restaurantList= new ArrayList<>();
        for(Integer keyId: getAllRestaurant().keySet() ){
            Restaurant restaurant =getAllRestaurant().get(keyId);
            if(restaurant.getRestaurantID().equals(id)){
                restaurantList.add(restaurant);
            }
        }
        return restaurantList;
    }

    public String deleteRestaurant(Integer id) {
         getAllRestaurant().remove(id);
         return "mention id is deleted ";
    }

    public String updateRestaurant(Integer id, String rtAddress) {
        if (getAllRestaurant().containsKey(id)) {
            Restaurant restaurant = getAllRestaurant().get(id);
            restaurant.setRtAddress(rtAddress);
        }
        return  "address id updated ";}

}
