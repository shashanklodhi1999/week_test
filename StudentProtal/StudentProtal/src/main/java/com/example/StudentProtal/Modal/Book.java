package com.example.StudentProtal.Modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    private Integer id;

    private String title;
    private String author;
    private String description;
    private String price;

    @ManyToOne
    @JoinColumn(name = "Fk_student_id" )
    private Student student;
}
