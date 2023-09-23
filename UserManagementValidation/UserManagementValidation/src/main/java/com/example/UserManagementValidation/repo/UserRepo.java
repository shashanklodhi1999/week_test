package com.example.UserManagementValidation.repo;

import com.example.UserManagementValidation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserRepo {
    @Autowired
   Map<Long , User> userMap;
 public  Map<Long ,User> getUserMap(){
     return  userMap;
 }
}
