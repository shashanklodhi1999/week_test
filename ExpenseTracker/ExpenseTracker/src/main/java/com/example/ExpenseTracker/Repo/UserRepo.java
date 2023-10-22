package com.example.ExpenseTracker.Repo;

import com.example.ExpenseTracker.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

    User findFirstByUserEmail(String email);
}
