package com.example.StudentProtal.Service;

import com.example.StudentProtal.Modal.Laptop;
import com.example.StudentProtal.Repo.ILaptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    ILaptop iLaptop;
    public String addlaptop(Laptop laptop) {
        iLaptop.save(laptop);
        return "laptop added";
    }

    public List<Laptop> getLaptop() {
        return iLaptop.findAll();
    }

    public Laptop getLaptopById(String id) {
        return iLaptop.findById(id).get();
    }

    public String updatePrice(String id, Integer price) {
        Laptop laptop=iLaptop.findById(id).get();
        laptop.setPrice(price);
        iLaptop.save(laptop);
        return "updated";
    }

    public String removeLaptop(String id) {
        iLaptop.deleteById(id);
        return "removed";
    }
}
