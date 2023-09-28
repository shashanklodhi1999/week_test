package com.sha.UniversityEvent.Contorller;

import com.sha.UniversityEvent.Modle.Department;
import com.sha.UniversityEvent.Modle.Student;
import com.sha.UniversityEvent.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentContorller {
    @Autowired
 StudentService studentService ;
    @PostMapping("AddSingleStudent")
public  String addStudent(@RequestBody Student student){
    return studentService.addStudent(student);
    }
    @PostMapping("AddListOFStudent")
    public String addAllStudent( @RequestBody  List<Student> newStudent){
    return  studentService.addAllStudent(newStudent);
    }
    @GetMapping("GetAllStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("GetStudentBYID")
    public Student GetById(@RequestParam Integer id) {
        return studentService.getByID(id);
    }
    @PutMapping("UpdateStudentDepartment/{id}")
    public String updateStudentDepartment(@PathVariable Integer id , @RequestParam  Department department){
        return  studentService.updateStudentDepartment(id ,department);
    }
    @DeleteMapping("deleteByID")
    public String deleteStudentById(@RequestParam Integer id){
         return studentService.deleteStudentById(id);
    }
}
