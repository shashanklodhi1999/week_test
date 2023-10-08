package com.example.StudentProtal.Controller;

import com.example.StudentProtal.Modal.Laptop;
import com.example.StudentProtal.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @PostMapping("Laptops")
    public String addLaptop(@RequestBody Laptop laptop){
        return laptopService.addlaptop(laptop);
    }
    @GetMapping("Laptop")
    public List<Laptop> getLaptop(){
        return laptopService.getLaptop();
    }
    @GetMapping("GetLaptopByID")
    public Laptop getLaptopById(@RequestParam String id){
        return  laptopService.getLaptopById(id);
    }
    @PutMapping("updateLaptopPrice")
    public String updateLaptopPrice(@RequestParam String id , Integer price ){
        return  laptopService.updatePrice(id,price);
    }
    @DeleteMapping("removeLaptop")
    public String removeLaptop(@RequestParam String id){
        return laptopService.removeLaptop(id);
    }
}
