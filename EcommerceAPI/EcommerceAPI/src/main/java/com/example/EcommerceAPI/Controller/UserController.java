package com.example.EcommerceAPI.Controller;

import com.example.EcommerceAPI.Model.User;
import com.example.EcommerceAPI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("UserCreated")
    public String CreateUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping("GetUserByID")
    public User getUserBYId(@RequestParam Long id){
        return userService.GetUserById(id);
    }
    @GetMapping("GetAllUser")
    public List<User> getAllUser(){
        return userService.getAllUSer();
    }

}
