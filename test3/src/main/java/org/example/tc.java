package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class tc {

    @Bean
    public void print() {
        System.out.println("this class full name is test class ");
    }
@Bean
    public List<Integer> createNumberList() {
        System.out.println("new  empty array list is created");
        return new ArrayList<>();
    }

}