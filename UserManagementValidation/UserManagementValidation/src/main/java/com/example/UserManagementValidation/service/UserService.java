package com.example.UserManagementValidation.service;

import com.example.UserManagementValidation.model.User;
import com.example.UserManagementValidation.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
  UserRepo userRepo;

    public String addUser(User user) {
         userRepo.getUserMap().put(user.getUserID(),user);
         return  "user added";
    }

    public Map<Long, User> getAllUser() {
        return userRepo.getUserMap();
    }

    public List< User> getUserById(Long id) {
        List<User> userList =new ArrayList<>();
        for(Long keyId : userRepo.getUserMap().keySet()){
            User user = getAllUser().get(keyId);
            if(user.getUserID().equals(id)){
                userList.add(user);
            }
        }
        return  userList;
    }

    public String updateUserById( Long id ,String userMail) {
        if(userRepo.getUserMap().containsKey(id)){
             User user =getAllUser().get(id);
             user.setUserEmail(userMail);
        }
        return "updated";
    }

    public String deleteUser(Long id) {
        getAllUser().remove(id);
        return "user deleted";
    }
}
