package com.example.OneToOneMapping.repo;

import com.example.OneToOneMapping.Model.Address;
import com.example.OneToOneMapping.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmp extends JpaRepository<Employee,Long> {

}
