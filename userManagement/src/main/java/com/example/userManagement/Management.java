package com.example.userManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Management {
    @Autowired
    List<User> userList;
    @PostMapping("addUser")
  public  String addUser(@RequestBody User user){
      userList.add(user);
      return "user added ";
  }
  @GetMapping("GetAllUser")
  public List<User> getAllUser(){
        return userList;
  }

@GetMapping("getSingleUser/{id}")
  public User getSingleUser(@PathVariable Integer id ){
        return  userList.get(id);
  }


    @PutMapping("updatePhoneNumber/{id}")
    public String updateUserPN( @PathVariable Integer id , @RequestParam Integer userPN){
      for(User user : userList){
          if(user.getUserId().equals(id)){
               user.setUserPN(userPN);
               return "user phone no is changed";
          }
      }
      return "Invalid id ";
    }
    @DeleteMapping("DeleteUser/{id}")
    public String DeleteUser(@PathVariable Integer id){
        for(User user: userList){
            if(user.getUserId().equals(id)){
                userList.remove(user);
                return "user " + user.getUserName()+ " is removed " ;
            }
        }
        return "Invalid user id,can not remove. ";
    }

}
