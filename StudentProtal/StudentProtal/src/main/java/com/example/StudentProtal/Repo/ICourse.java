package com.example.StudentProtal.Repo;

import com.example.StudentProtal.Modal.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ICourse extends JpaRepository<Course ,String> {

}
