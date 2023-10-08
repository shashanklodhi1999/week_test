package com.example.StudentProtal.Controller;

import com.example.StudentProtal.Modal.Student;
import com.example.StudentProtal.Repo.IStudent;
import com.example.StudentProtal.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("Students")
    public String postStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("Students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("FindByID")
    public Student findStudent(@RequestParam String id){
        return studentService.findStudent(id);
    }
    @PutMapping("update phoneNUmber")
    public String updatePhone(@RequestParam String id , String newPhone){
        return studentService.updateNumber(id , newPhone);
    }
    @DeleteMapping("removeStudent")
    public String removeStudent(@RequestParam String id){
        return studentService.removeStudent(id);
    }
}
