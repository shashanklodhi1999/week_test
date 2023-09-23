package com.example.UserManagementValidation.repo;

import com.example.UserManagementValidation.model.User;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DateSource {
    @Bean
     Map<Long , User> getUserMap(){
        return  new HashMap<>();
    }
}
