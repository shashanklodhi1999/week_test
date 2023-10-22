package com.example.ExpenseTracker.Repo;

import com.example.ExpenseTracker.Model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticationTokenRepo extends JpaRepository<AuthenticationToken,Integer> {


    AuthenticationToken findFirstByTokenValue(String tokenValue);
}
