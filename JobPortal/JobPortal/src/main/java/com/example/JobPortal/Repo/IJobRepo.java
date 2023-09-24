package com.example.JobPortal.Repo;

import com.example.JobPortal.Model.Job;
import com.example.JobPortal.Model.JobType;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJobRepo  extends CrudRepository<Job,Integer> {



    @Modifying
    @Query(value= "UPDATE JOB SET SALARY= (:newSalary) where LOCATION = :location" ,nativeQuery = true)
    void UpdateSalaryByDepartmentBPS(Integer newSalary, String location);


    @Modifying
    @Query(value="Delete from JOB where EMPLOYER_NAME= :name " ,nativeQuery = true)
    void DeleteEpmByname(String name);
}

