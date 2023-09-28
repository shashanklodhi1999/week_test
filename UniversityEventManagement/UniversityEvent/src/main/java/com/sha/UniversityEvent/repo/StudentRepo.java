package com.sha.UniversityEvent.repo;

import com.sha.UniversityEvent.Modle.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer > {
}
