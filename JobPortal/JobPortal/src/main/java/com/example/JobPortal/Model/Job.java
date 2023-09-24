package com.example.JobPortal.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Job {


        @Id
        private Integer id;

        @NotBlank(message = "Title is required")
        private String title;

        @NotBlank(message = "Description is required")
        private String description;

        @NotBlank(message = "Location is required")
        private String location;

        @NotNull(message = "Salary is required")
        @Min(value = 20000, message = "Salary should be above 20,000")
        private Integer salary;

        @NotBlank(message = "Company email is required")
        @Email(message = "Invalid email format")
        private String companyEmail;

        @NotBlank(message = "Company name is required")
        private String companyName;

        @NotBlank(message = "Employer name is required")
        private String employerName;

        @Enumerated(EnumType.STRING)
        @NotNull(message = "Job type is required")
        private JobType jobType;

        @NotNull(message = "Applied date is required")
        private LocalDate appliedDate;


}
