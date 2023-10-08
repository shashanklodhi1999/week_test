package com.example.StudentProtal.Service;

import com.example.StudentProtal.Modal.Address;
import com.example.StudentProtal.Repo.IAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddress iAddress;
    public List<Address> getAdd() {
        return iAddress.findAll();
    }

    public String addAddress(Address newAddress) {
        iAddress.save(newAddress);
        return "address added";
    }

    public Address getById(Long id) {
        return iAddress.findById(id).get();
    }

    public String updateAddState(Long id, String mark) {
        Address address=iAddress.findById(id).get();
        address.setLandmark(mark);
        iAddress.save(address);
        return "Landmark updated";
    }

    public String removeAddress(Long id) {
        iAddress.deleteById(id);
        return "address removed";
    }
}
