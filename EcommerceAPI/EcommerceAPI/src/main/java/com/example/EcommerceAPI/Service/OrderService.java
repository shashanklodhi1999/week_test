package com.example.EcommerceAPI.Service;

import com.example.EcommerceAPI.Model.OrderEco;
import com.example.EcommerceAPI.Model.User;
import com.example.EcommerceAPI.Repo.IOrder;
import com.example.EcommerceAPI.Repo.IUSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    IOrder iOrder;

    @Autowired
    IUSer iuSer;
    public String createOrder(OrderEco orderEco) {
        iOrder.save(orderEco);
        return "order is created";
    }

    public OrderEco getOrderById(Long id) {

        return iOrder.findById(id).get();
    }


}
