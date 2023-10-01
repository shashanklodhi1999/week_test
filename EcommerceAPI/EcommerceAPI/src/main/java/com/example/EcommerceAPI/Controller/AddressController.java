package com.example.EcommerceAPI.Controller;

import com.example.EcommerceAPI.Model.Address;
import com.example.EcommerceAPI.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
@PostMapping("CreatedAddress")
    public String createAddress(@RequestBody Address address){
     return addressService.createAddress(address);
}
}
