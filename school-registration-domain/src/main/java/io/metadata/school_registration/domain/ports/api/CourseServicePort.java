package io.metadata.school_registration.domain.ports.api;

import io.metadata.school_registration.domain.model.Course;
import java.util.Set;

public interface CourseServicePort {

  Course add(Course student);
  Course update(Course student);
  void deleteById(Integer id);
  Set<Course> getAll();
  Course findById(Integer id);
  Set<Course> getAllWithRegistrationsAndStudents();
}
