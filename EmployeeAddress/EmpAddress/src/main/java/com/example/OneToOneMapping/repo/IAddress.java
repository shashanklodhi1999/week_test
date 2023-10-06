package com.example.OneToOneMapping.repo;

import com.example.OneToOneMapping.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddress extends JpaRepository<Address ,Long> {

}
