package com.example.OneToOneMapping.Service;

import com.example.OneToOneMapping.Model.Address;
import com.example.OneToOneMapping.Model.Employee;
import com.example.OneToOneMapping.repo.IAddress;
import com.example.OneToOneMapping.repo.IEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddService {
    @Autowired
    IAddress iAddress;

    public String addEmp(Address newAdd) {
        iAddress.save(newAdd);
        return "added";
    }

    public List<Address> getAdd() {
        return iAddress.findAll();
    }

    public Address getById(Long id) {
        return iAddress.findById(id).get();
    }

    public String updateAddState(Long id, String state) {
        Address address=iAddress.findById(id).get();
        address.setState(state);
        iAddress.save(address);
        return "updated";
    }

    public String removeAddress(Long id) {
        iAddress.deleteById(id);
        return "removed";
    }
}
