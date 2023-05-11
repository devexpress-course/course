package devexpress.course.course.endpoint.service;

import devexpress.course.course.domain.dto.CourseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import devexpress.course.course.model.Course;
import devexpress.course.course.repository.CourseRepository;

@Service
public class CouseService {

	private final ModelMapper modelMapper;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	public CouseService(ModelMapper modelmapper){
		this.modelMapper = modelmapper;
	}
	
	public Iterable<Course> listAll(Pageable pageable){
		return courseRepository.findAll(pageable);
	}

	public Course create(CourseDTO courseDTO) {
		return courseRepository.save(modelMapper.map(courseDTO, Course.class));
	}
	
}
