package com.in28minutes.learn_spring_boot.courses.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learn_spring_boot.courses.beans.Course;

@RestController
public class CourseController {
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return List.of(new Course(1l, "Learn Spring Boot", "in28minutes"));
	}
}
