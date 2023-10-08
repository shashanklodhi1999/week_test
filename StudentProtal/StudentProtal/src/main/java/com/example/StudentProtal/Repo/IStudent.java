package com.example.StudentProtal.Repo;

import com.example.StudentProtal.Modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

public interface IStudent extends JpaRepository<Student,String> {




}
