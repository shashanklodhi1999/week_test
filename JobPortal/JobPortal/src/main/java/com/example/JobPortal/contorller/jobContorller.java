package com.example.JobPortal.contorller;

import com.example.JobPortal.Model.Job;
import com.example.JobPortal.Model.JobType;
import com.example.JobPortal.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class jobContorller {
    @Autowired
    JobService jobService;

    @PostMapping("addingJobProfile")
    public String addJob( @RequestBody Job job ){
         return jobService.addJOb(job);
    }
    @PostMapping("addingMultipleEmp")
    public String addingMultipleEmp(@RequestBody List<Job> newJob){
        return jobService.addingMultipleEmp(newJob);
    }
    @GetMapping("GetAllEmpProfile")
    public List<Job> getAllProfile(){
        return jobService.getAllProfile();
    }
    @GetMapping("GetEmpByID/{id}")
    public Job getEmpById(@PathVariable Integer id){
        return jobService.getEmpById(id);
    }
    @PutMapping("UpdateEmpSalaryById")
    public String updateEmpSalaryById(@RequestParam Integer id , @RequestParam Integer newSalary){
        return jobService.updateEmpSalaryById( id ,newSalary);
    }
    @DeleteMapping("DeleteEmpById/{id}")
    public String deleteEmpById(@PathVariable Integer id){
        return jobService.deleteEmoById(id);
    }
    @PutMapping("UpdateSalaryByLocationBPS/{location}")
    public String updateSalaryByDepartmentIsBps(@RequestParam Integer newSalary ,@PathVariable String location ){
        return jobService.UpdateSalaryByDepartmentBPS(newSalary ,location);
    }

    @DeleteMapping("DeleteEpmByJobType/{name}")
    public String DeleteEpmByName(@PathVariable String name ){
        return jobService.DeleteEpmByname(name);
    }
}
