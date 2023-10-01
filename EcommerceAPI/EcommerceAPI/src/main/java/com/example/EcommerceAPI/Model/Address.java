package com.example.EcommerceAPI.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    private Long addressId;
    private String name;
    private String landmark;
    private String phoneNumber;
    private String zipcode;
    private String state;


}
