package com.example.EcommerceAPI.Service;

import com.example.EcommerceAPI.Model.User;
import com.example.EcommerceAPI.Repo.IUSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUSer iuSer;

    public String createUser(User user) {
        iuSer.save(user);
        return " user is Created";
    }

    public User GetUserById(Long id) {
        return iuSer.findById(id).get();
    }

    public List<User> getAllUSer() {
        return  (List<User>) iuSer.findAll();
    }
}
