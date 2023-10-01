package com.example.EcommerceAPI.Repo;

import com.example.EcommerceAPI.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUSer extends JpaRepository<User ,Long> {


}
