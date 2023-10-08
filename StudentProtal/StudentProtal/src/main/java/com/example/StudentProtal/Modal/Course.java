package com.example.StudentProtal.Modal;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    private String courseID;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    @JoinColumn(name="fk_student_id")
    private List<Student> students;

}
