package com.example.UserManagementValidation.contoller;

import com.example.UserManagementValidation.model.User;
import com.example.UserManagementValidation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Validated
public class UserContorller {
    @Autowired
    UserService userService ;
    @PostMapping("AddingUser")
    public String postUser(@RequestBody  @Valid User user){
        return userService.addUser(user);
    }
    @GetMapping("GetAllUser")
    public Map<Long ,User> getAllUser(){
         return userService.getAllUser();
    }
    @GetMapping("getUserById/{id}")
    public List<User> getUserById(@PathVariable Long id){
         return userService.getUserById(id);
    }
    @PutMapping("updateById/{id}/userMail/{userMail}")
    public String updateById( @PathVariable Long id ,@PathVariable String userMail){
        return  userService.updateUserById(id , userMail);
    }
    @DeleteMapping("deleteUser/{id}")
    public String deleteUser(@PathVariable Long id){
         return userService.deleteUser(id);
    }
}
