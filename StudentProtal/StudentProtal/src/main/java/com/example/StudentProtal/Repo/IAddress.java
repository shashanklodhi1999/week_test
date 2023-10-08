package com.example.StudentProtal.Repo;

import com.example.StudentProtal.Modal.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IAddress extends JpaRepository<Address ,Long> {
}
