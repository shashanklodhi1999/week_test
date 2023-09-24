package com.example.JobPortal.Service;

import com.example.JobPortal.Model.Job;
import com.example.JobPortal.Model.JobType;
import com.example.JobPortal.Repo.IJobRepo;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
 IJobRepo jobRepo;

    public String addJOb(Job job) {
        jobRepo.save(job);
        return "profile added ";
    }

    public List<Job> getAllProfile() {
        return  (List<Job>) jobRepo.findAll();
    }

    public Job getEmpById(Integer id) {
        return   jobRepo.findById(id).get();
    }

    public String updateEmpSalaryById(Integer id, Integer newSalary) {
          Job job= jobRepo.findById(id).orElse(null);
          if(job != null){
             job.setSalary(newSalary);
             jobRepo.save(job);
             return "salary updated ";
          }
          else{
            return  "id not found";
          }

    }

    public String deleteEmoById(Integer id) {
        jobRepo.deleteById(id);
        return "Emp deleted ";

    }

    public String addingMultipleEmp(List<Job> newJob) {
        jobRepo.saveAll(newJob);
        return "added";
    }
    @Transactional
    public String UpdateSalaryByDepartmentBPS(Integer newSalary, String location) {
          jobRepo.UpdateSalaryByDepartmentBPS(newSalary ,location);
          return "updated";
    }
@Transactional
    public String DeleteEpmByname(String name) {
        jobRepo.DeleteEpmByname(name);
        return "deleted";
    }
}
