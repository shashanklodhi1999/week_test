package com.example.ExpenseTracker.Repo;

import com.example.ExpenseTracker.Model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepo extends JpaRepository<Expense ,Integer> {


}
