package com.example.StudentProtal.Service;

import com.example.StudentProtal.Modal.Student;
import com.example.StudentProtal.Repo.IStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudent  iStudent;

    public String addStudent(Student student) {
        iStudent.save(student);
        return "student added";
    }

    public List<Student> getAllStudent() {
        return iStudent.findAll();
    }

    public Student findStudent(String id) {
        return iStudent.findById(id).get();
    }

    public String updateNumber(String id, String newPhone) {
         Student student=iStudent.findById(id).get();
         student.setPhoneNumber(newPhone);
         return "updated";
    }

    public String removeStudent(String id) {
        iStudent.deleteById(id);
        return "removed";
    }
}
