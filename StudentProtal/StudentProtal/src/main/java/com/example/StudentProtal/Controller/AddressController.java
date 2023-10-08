package com.example.StudentProtal.Controller;


import com.example.StudentProtal.Modal.Address;
import com.example.StudentProtal.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("Address")
    public String addAddress(@RequestBody Address newAddress)
    {
        return addressService.addAddress(newAddress);
    }
    @GetMapping("Address")
    public List<Address> Add() {
        return addressService.getAdd();
    }
    @GetMapping("AddressById")
    public  Address getById(@RequestParam Long id){
        return  addressService.getById(id);
    }
    @PutMapping("UpdatingDetailsAsLandMark")
    public  String updateAddState(@RequestParam Long id , String mark){
        return addressService.updateAddState(id,mark);
    }
    @DeleteMapping("RemoveTheAddress")
    public  String removeAddress(@RequestParam Long id){
        return addressService.removeAddress(id);
    }

}
