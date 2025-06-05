package com.example.demo;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private List<Course> courses = List.of(
            new Course("cs100", "comp 100"),
            new Course("cs101", "comp 101")
    );

    @Tool(name = "getCourseByCourseId", description = "get course by course id")
    public Course getCourseByCourseId(String courseId) {
            return courses.stream()
                    .filter(c -> c.courseId().equals(courseId))
                    .findFirst()
                    .orElse(null);
    }

    @Tool
    public List<Course> getCourses() {
        return courses;
    }
}
