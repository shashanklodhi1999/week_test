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
//@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Student.class,property="studentID")
public class Student {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String studentID;

    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;

    @OneToOne
    @JoinColumn(name = "Fk_address_id" )
    private Address address;

    @OneToMany
    @JoinColumn(name = "Fk_course_id" )
     private List<Course> courses;
}
