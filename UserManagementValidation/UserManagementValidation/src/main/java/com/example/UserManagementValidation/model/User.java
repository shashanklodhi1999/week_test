package com.example.UserManagementValidation.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotNull(message = "user id sould not be null ")
    private Long userID;

    @NotBlank(message = "Username is required")
    private String userName ;

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date of Birth should be in yyyy-MM-dd format")
    private String userDOB;

    @Email(message = "Invalid email address")
    private String userEmail;

    @Size(min=10,max=12)
    @Pattern(regexp = "^[0-9]+$", message = "contacts should be just numbers!!")
    private  String phoneNumber;

    @Pattern(regexp = "\\d{2}:\\d{2}", message = "Invalid time format. Use HH:mm")
    private String time;

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date of Birth should be in yyyy-MM-dd format")
    private String date;

}


