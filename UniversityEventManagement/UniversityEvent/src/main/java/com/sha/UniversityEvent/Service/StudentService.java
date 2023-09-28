package com.sha.UniversityEvent.Service;

import com.sha.UniversityEvent.Modle.Department;
import com.sha.UniversityEvent.Modle.Student;
import com.sha.UniversityEvent.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo ;

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Student added";
    }

    public String addAllStudent(List<Student> newStudent) {
        studentRepo.saveAll(newStudent);
        return "added all the Student";
    }

    public List<Student> getAllStudent() {
        return (List<Student>) studentRepo.findAll();
    }


    public Student getByID(Integer id) {
        return studentRepo.findById(id).get();
    }

    public String updateStudentDepartment(Integer id , Department department) {
       Student student=studentRepo.findById(id).orElse(null);
       if(student!=null){
           student.setDepartment(department);
           studentRepo.save(student);
           return "updated";
        }
       else {
           return "Id is not valid ";
       }
    }

    public String deleteStudentById(Integer id) {
        studentRepo.deleteById(id);
        return "Student removed";
    }
}
