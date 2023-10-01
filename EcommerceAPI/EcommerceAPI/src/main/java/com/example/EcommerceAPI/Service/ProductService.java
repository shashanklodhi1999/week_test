package com.example.EcommerceAPI.Service;

import com.example.EcommerceAPI.Model.Product;
import com.example.EcommerceAPI.Repo.Iproduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    Iproduct iproduct;

    public String createProduct(Product product) {
         iproduct.save(product);
         return "product added";
    }





    public String deleteProductById(Long id) {
        iproduct.deleteById(id);
        return  "product  is deleted ";
    }

    public Product getProductByCategory(Long id) {
        return iproduct.findById(id).get();
    }
}
