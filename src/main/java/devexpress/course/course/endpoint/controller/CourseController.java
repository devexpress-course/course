package devexpress.course.course.endpoint.controller;

import devexpress.course.course.domain.dto.CourseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import devexpress.course.course.endpoint.service.CouseService;
import devexpress.course.course.model.Course;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
	
	@Autowired
	private CouseService courseService;

	@GetMapping
	public ResponseEntity<Iterable<Course>> listAll(Pageable pageable) {
		return new ResponseEntity<>(courseService.listAll(pageable), HttpStatus.OK);
	}

	@PostMapping
	public Course create(@RequestBody CourseDTO courseDTO){
		return courseService.create(courseDTO);
	}
}
