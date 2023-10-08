package com.example.StudentProtal.Modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Laptop {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String laptopID;
    private String name;
    private String brand;
    private Integer price;

    @OneToOne
    @JoinColumn(name = "Fk_student_id" )
    private Student student;
}
