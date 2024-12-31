package mz.com.dimasoft.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mz.com.dimasoft.crudspring.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
