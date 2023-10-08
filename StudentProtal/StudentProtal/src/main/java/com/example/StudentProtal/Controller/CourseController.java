package com.example.StudentProtal.Controller;

import com.example.StudentProtal.Modal.Address;
import com.example.StudentProtal.Modal.Course;
import com.example.StudentProtal.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("Course")
    public String add(@RequestBody Course newCourse)
    {
        return courseService.addC(newCourse);
    }
    @GetMapping("Course")
    public List<Course> getAllCourse() {
        return courseService.getCourse();
    }
    @GetMapping("CourseByIs")
    public  Course getByCourseId(@RequestParam String id){
        return  courseService.getByCourseId(id);
    }
    @PutMapping("UpdatingDetailsAsDuration")
    public  String updateCourseDuration(@RequestParam String id ,@RequestParam String duration){
        return courseService.updateDuration(id,duration);
    }
    @DeleteMapping("RemoveCourse")
    public  String removeC(@RequestParam String id){
        return courseService.removeC(id);
    }

}
