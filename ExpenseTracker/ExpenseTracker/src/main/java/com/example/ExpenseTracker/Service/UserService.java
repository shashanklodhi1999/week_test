package com.example.ExpenseTracker.Service;

import com.example.ExpenseTracker.Model.AuthenticationToken;
import com.example.ExpenseTracker.Model.User;
import com.example.ExpenseTracker.Repo.AuthenticationTokenRepo;
import com.example.ExpenseTracker.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    AuthenticationTokenService authenticationTokenService;

    public String userSingUp(User newUser) {
        String email =newUser.getUserEmail();
        User existingUser =userRepo.findFirstByUserEmail(email);
        if(existingUser!=null){
          return  "user is already exist please try for singup";
        }
        String password=newUser.getPassword();
        try {
            String passwordEncryptor= PasswordEncryptor.encrypt(password);
            newUser.setPassword(passwordEncryptor);
            userRepo.save(newUser);
            return "user is singed up ";


        } catch (NoSuchAlgorithmException e) {
            return  " internal server";
        }
    }

    public String userSingIn(String email, String password) {

        User existingUser=userRepo.findFirstByUserEmail(email);
        if(existingUser==null){
            return "user is not sing up ";
        }
        try {
            String passwordEncryptor =PasswordEncryptor.encrypt(password);

            if(existingUser.getPassword().equals(passwordEncryptor)){
                AuthenticationToken token= new AuthenticationToken(existingUser);
                 authenticationTokenService.CreateToken(token);
                 return token.getTokenValue();

            }else
            {
                return "password is wrong ";
            }

        } catch (NoSuchAlgorithmException e) {
            return "internal server error";

        }

    }

    public String userSingOut(String email, String tokenValue) {
        if(authenticationTokenService.authenticateToken(email ,tokenValue )){
            User existingUser = userRepo.findFirstByUserEmail(email);
            authenticationTokenService.singOut(tokenValue);

            return "User sing out is done ";
        }
        else{
            return  "Unauthenticate access";
        }

    }
}
