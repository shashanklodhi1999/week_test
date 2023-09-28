package com.sha.UniversityEvent.Modle;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id

    @NotNull
    private Long studentId;

    @Pattern(regexp = "^[A-Z][a-zA-Z]*$", message = "First name should start with a capital letter")
    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @Min(value = 18, message = "Age should be at least 18")
    @Max(value = 25, message = "Age should not exceed 25")
    private int age;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Department is required")
    private Department department;
}
