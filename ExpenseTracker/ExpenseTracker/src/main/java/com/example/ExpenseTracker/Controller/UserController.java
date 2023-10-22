package com.example.ExpenseTracker.Controller;

import com.example.ExpenseTracker.Model.Expense;
import com.example.ExpenseTracker.Model.User;
import com.example.ExpenseTracker.Service.ExpanseService;
import com.example.ExpenseTracker.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("UserSingUp")
    public String userSingUp(@RequestBody User newUser){
        return  userService.userSingUp(newUser);
    }

    @PostMapping("UserSingIn")
    public String userSingIn(@RequestParam String email ,@RequestParam String password){
        return  userService.userSingIn(email ,password);
    }

    @DeleteMapping("User/SingOut")
    public String userSingOut(@RequestParam String email ,@RequestParam String tokenValue){
        return userService.userSingOut(email ,tokenValue);
    }
    @Autowired
    ExpanseService expanseService;
    @PostMapping("Expense")
    public String  expenses(@RequestParam String email , @RequestParam String tokenValue , @RequestBody Expense expense){
        return  expanseService.expense(email ,tokenValue ,expense);
    }

    @GetMapping("Expense")
    public List<Expense> getExpense(){
        return  expanseService.getExpense();
    }
    @PutMapping("UpdateExpancePriceByid")
    public String expensePrice(@RequestParam Integer id ,@RequestParam Double price){
         return expanseService.expenseprice(id , price);
    }
    @DeleteMapping("DeleteExpenseByID")
    public String deleteExpense(@RequestParam Integer id){
        return  expanseService.deleteExpense(id);
    }

}
