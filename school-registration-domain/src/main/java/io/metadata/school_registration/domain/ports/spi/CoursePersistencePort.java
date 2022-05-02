package io.metadata.school_registration.domain.ports.spi;

import io.metadata.school_registration.domain.model.Course;
import java.util.Optional;
import java.util.Set;

public interface CoursePersistencePort {

  Course add(Course proposal);
  Course update(Course proposal);
  void deleteById(Integer id);
  Set<Course> getAll();
  Optional<Course> findById(Integer id);
  Set<Course> getAllWithRegistrationsAndStudents();
  Set<Course> findAllCoursesForStudent(Integer studentId);
  Set<Course> findAllCoursesWithoutAnyStudent();
}
