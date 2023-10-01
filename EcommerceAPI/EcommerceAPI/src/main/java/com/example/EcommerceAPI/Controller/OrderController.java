package com.example.EcommerceAPI.Controller;

import com.example.EcommerceAPI.Model.OrderEco;
import com.example.EcommerceAPI.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("CreatedOrder")
     public String createOrder(@RequestBody OrderEco orderEco){

         return  orderService.createOrder(orderEco);

     }
     @GetMapping("GetOrderBYid")
     public OrderEco getOrderById(@RequestParam Long id){
        return orderService.getOrderById(id);
     }
}

