package com.example.OneToOneMapping.Controller;

import com.example.OneToOneMapping.Model.Employee;
import com.example.OneToOneMapping.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmpService empService;
    @PostMapping("Employee")
    public String addEmp(@RequestBody Employee newEmp){

        return  empService.addEmp(newEmp);
    }
    @GetMapping("Employee")
    public List<Employee> getEmp()
    {
        return  empService.getEmp();
    }
    @GetMapping("FindEmpById")
    public  Employee getById(@RequestParam Long id){
        return  empService.getById(id);
    }
    @PutMapping("UpdatingDetails")
    public  String updateEmpLname(@RequestParam Long id , String lname){
        return empService.updateEmpLname(id,lname);
    }
    @DeleteMapping("RemoveTheEmp")
    public  String removeEmp(@RequestParam Long id){
        return empService.removeEmp(id);
    }
}
