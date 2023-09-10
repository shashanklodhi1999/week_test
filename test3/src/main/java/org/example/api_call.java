package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
public class api_call {
@Autowired
    List<Integer> obj;
    @GetMapping("api/sum/{num1}/{num2}")
    public String sum(@PathVariable Integer num1,@PathVariable Integer num2) {
        if (num1 + num2 > 10) {
            return "Sum of number is greater then 10 ";
        } else {
            return "sum of the number is  less than 10";
        }
    }@Primary
    @GetMapping("get_arraylist")
    public List<Integer> getValue(){
        obj.add(10);
        obj.add(20);
        return obj;
    }

}
