package com.example.EcommerceAPI.Repo;

import com.example.EcommerceAPI.Model.OrderEco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrder extends JpaRepository<OrderEco, Long> {

}
