package com.example.StudentProtal.Repo;

import com.example.StudentProtal.Modal.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IBook extends JpaRepository<Book,Integer> {

}
