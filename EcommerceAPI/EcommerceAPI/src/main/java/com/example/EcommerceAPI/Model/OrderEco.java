package com.example.EcommerceAPI.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderEco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Integer productQuantity;

    @OneToOne
    @JoinColumn(name = "fk_UserId")
    private User user;

    @OneToOne
    @JoinColumn(name = "fk_ProductId")
    private Product product;

    @OneToOne
    @JoinColumn(name = "fk_addressId")
    private Address address;



}
