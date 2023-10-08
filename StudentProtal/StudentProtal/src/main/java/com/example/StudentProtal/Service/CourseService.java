package com.example.StudentProtal.Service;

import com.example.StudentProtal.Modal.Address;
import com.example.StudentProtal.Modal.Course;
import com.example.StudentProtal.Repo.ICourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    ICourse iCourse;
    public String addC(Course newCourse) {
        iCourse.save(newCourse);
        return "course added";
    }

    public List<Course> getCourse() {
        return  iCourse.findAll();
    }

    public Course getByCourseId(String id) {
        return  iCourse.findById(id).get();
    }

    public String updateDuration(String id, String duration) {
        Course course=iCourse.findById(id).get();
        course.setDuration(duration);
        return " duration updated";

    }

    public String removeC(String id) {
        iCourse.deleteById(id);
        return "removed";

    }
}
