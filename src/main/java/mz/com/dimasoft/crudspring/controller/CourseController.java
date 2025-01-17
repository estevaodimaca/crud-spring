package mz.com.dimasoft.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mz.com.dimasoft.crudspring.model.Course;
import mz.com.dimasoft.crudspring.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin("*")
public class CourseController {

	private final CourseRepository courseRepository;

	public CourseController(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@GetMapping
	public List<Course> list() {
		return courseRepository.findAll();
	}

}
