package com.example.ExpenseTracker.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer expenseId;
    private String title;
    private String description;
    private double price;
    private LocalDate date;
    @OneToOne
    @JoinColumn(name = "fk_user_Id")
    User user;

}
