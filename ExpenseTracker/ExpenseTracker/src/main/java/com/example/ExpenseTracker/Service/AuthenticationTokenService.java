package com.example.ExpenseTracker.Service;

import com.example.ExpenseTracker.Model.AuthenticationToken;
import com.example.ExpenseTracker.Repo.AuthenticationTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationTokenService {

    @Autowired
    AuthenticationTokenRepo authenticationTokenRepo;


    public void CreateToken(AuthenticationToken token) {
         authenticationTokenRepo.save(token);

    }

    public boolean authenticateToken(String email, String tokenValue) {
        AuthenticationToken token = authenticationTokenRepo.findFirstByTokenValue(tokenValue);
        if(token!=null)
        {
            return token.getUser().getUserEmail().equals(email);
        }
        else
        {
            return false;
        }
    }

    public void singOut(String tokenValue) {
        AuthenticationToken token =authenticationTokenRepo.findFirstByTokenValue(tokenValue);
        authenticationTokenRepo.delete(token);
    }
}
