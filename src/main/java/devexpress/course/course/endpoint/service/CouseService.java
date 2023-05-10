package devexpress.course.course.endpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import devexpress.course.course.model.Course;
import devexpress.course.course.repository.CourseRepository;

@Service
public class CouseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public Iterable<Course> listAll(Pageable pageable){
		return courseRepository.findAll(pageable);
	}
	
}
