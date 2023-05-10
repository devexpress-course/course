package devexpress.course.course.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import devexpress.course.course.model.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{

}
