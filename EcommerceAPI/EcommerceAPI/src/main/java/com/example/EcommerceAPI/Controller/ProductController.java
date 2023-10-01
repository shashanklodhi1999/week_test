package com.example.EcommerceAPI.Controller;

import com.example.EcommerceAPI.Model.Product;
import com.example.EcommerceAPI.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService ;
    @PostMapping("Create product")
    public String createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
    @GetMapping("GetProductById")
    public Product getProductByCategory(@RequestParam Long id){
        return productService.getProductByCategory(id);
    }
    @DeleteMapping("DeleteProductById")
    public String deleteProductById(@RequestParam Long id){
        return productService.deleteProductById(id);
    }
}
