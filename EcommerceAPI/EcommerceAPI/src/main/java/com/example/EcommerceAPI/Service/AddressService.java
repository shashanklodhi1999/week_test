package com.example.EcommerceAPI.Service;

import com.example.EcommerceAPI.Model.Address;
import com.example.EcommerceAPI.Repo.IAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddress iAddress;


    public String createAddress(Address address) {
        iAddress.save(address);
        return "address created";
    }
}
