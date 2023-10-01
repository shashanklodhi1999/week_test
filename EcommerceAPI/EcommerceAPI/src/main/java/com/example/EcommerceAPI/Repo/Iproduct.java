package com.example.EcommerceAPI.Repo;

import com.example.EcommerceAPI.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Repository
public interface Iproduct extends JpaRepository<Product , Long> {



}
