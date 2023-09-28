package com.sha.Restaurant.contorller;

import com.sha.Restaurant.entity.Dishes;
import com.sha.Restaurant.entity.Restaurant;
import com.sha.Restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
 public class RestaurantContorller {
    @Autowired
  RestaurantService restaurantService;

    @PostMapping("PostRestaurantDetails")
    public String addRestaurant( @RequestBody Restaurant restaurant){
           return restaurantService.addRestaurant(restaurant);
    }
    @GetMapping("getAllRestaurant")
    public Map<Integer ,Restaurant> getAllRestaurant(){
         return restaurantService.getAllRestaurant();

    }
    @GetMapping("GetBYId/{id}")
    public List<Restaurant> integerRestaurantBYID(@PathVariable Integer id){
        return restaurantService.getRestaurantBYId(id);
    }
    @DeleteMapping("DeleteRestaurantById/{id}")
    public String deleteRestaurant(@PathVariable Integer id){
         return restaurantService.deleteRestaurant(id);
    }
     @PutMapping("UpdateDish/{id}")
    public String updateRestaurantDish( @PathVariable Integer id ,@RequestParam String rtAddress){
         return  restaurantService.updateRestaurant(id ,rtAddress) ;
     }
     @PutMapping("UpdateBYId")
      public  String getById(@RequestBody Integer id ,String name){
            return restaurantService.updateById(id ,name );
     }
 }
