package com.example.EcommerceAPI.Repo;

import com.example.EcommerceAPI.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddress  extends JpaRepository<Address ,Long> {
}
