package com.example.OneToOneMapping.Controller;

import com.example.OneToOneMapping.Model.Address;
import com.example.OneToOneMapping.Model.Employee;
import com.example.OneToOneMapping.Service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddService addService;
    @PostMapping("Address")
  public  String addAddress(@RequestBody Address newAdd){
      return addService.addEmp(newAdd);
  }
    @GetMapping("Address")
    public List<Address> Add() {
         return addService.getAdd();
    }
    @GetMapping("FindAddressById")
    public  Address getById(@RequestParam Long id){
        return  addService.getById(id);
    }
    @PutMapping("UpdatingDetailsAsStateName")
    public  String updateAddState(@RequestParam Long id , String state){
        return addService.updateAddState(id,state);
    }
    @DeleteMapping("RemoveTheAddress")
    public  String removeAddress(@RequestParam Long id){
        return addService.removeAddress(id);
    }
}
