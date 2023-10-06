package com.example.OneToOneMapping.Service;

import com.example.OneToOneMapping.Model.Address;
import com.example.OneToOneMapping.Model.Employee;
import com.example.OneToOneMapping.repo.IAddress;
import com.example.OneToOneMapping.repo.IEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    IEmp iemp;
    public String addEmp(Employee newEmp) {
        iemp.save(newEmp);
        return "emp added";
    }

    public List<Employee> getEmp() {
        return iemp.findAll();
    }

    public Employee getById(Long id) {
       return iemp.findById(id).get();

    }
    public String updateEmpLname(Long id ,String lname) {
        Employee employee=iemp.findById(id).get();
        employee.setLastName(lname);
        iemp.save(employee);
        return "updated";

    }

    public String removeEmp(Long id) {
        iemp.deleteById(id);
        return "Emp removed";
    }
}
