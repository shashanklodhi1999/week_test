package com.sha.Restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private Integer restaurantID;
    private String restaurantName;
    private String rtAddress;
    private Staffs rtStaff;
    private  Dishes dish;

}
