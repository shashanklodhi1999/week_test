package com.example.ExpenseTracker.Service;

import com.example.ExpenseTracker.Model.Expense;
import com.example.ExpenseTracker.Model.User;
import com.example.ExpenseTracker.Repo.ExpenseRepo;
import com.example.ExpenseTracker.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpanseService {
    @Autowired
    ExpenseRepo expenseRepo;
    @Autowired
    AuthenticationTokenService authenticationTokenService;

   @Autowired
    UserRepo userRepo;
    public String expense(String email, String tokenValue, Expense expense) {
        if(authenticationTokenService.authenticateToken(email,tokenValue)){
             User existingUser=  userRepo.findFirstByUserEmail(email);
             expense.setUser(existingUser);
             expenseRepo.save(expense);
             return "expense is added";
        }else {
            return "invalid access";
        }
    }

    public List<Expense> getExpense() {
        return expenseRepo.findAll();
    }

    public String expenseprice(Integer id ,Double price) {
        Expense expense =expenseRepo.findById(id).get();
        expense.setPrice(price);
        expenseRepo.save(expense);
        return "updated";

    }

    public String deleteExpense(Integer id) {
        expenseRepo.deleteById(id);
        return   id + "deleted";
    }
}
