package io.metadata.school_registration.domain.service;

import io.metadata.school_registration.domain.exception.EntityNotFoundException;
import io.metadata.school_registration.domain.model.Course;
import io.metadata.school_registration.domain.ports.api.CourseServicePort;
import io.metadata.school_registration.domain.ports.spi.CoursePersistencePort;
import java.util.Set;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CourseServicePortImpl implements CourseServicePort {

  private final CoursePersistencePort coursePersistencePort;

  @Override
  public Course add(Course course) {
    return coursePersistencePort.add(course);
  }

  @Override
  public Course update(Course course) {
    return coursePersistencePort.update(course);
  }

  @Override
  public void deleteById(Integer id) {
    coursePersistencePort.deleteById(id);
  }

  @Override
  public Set<Course> getAll() {
    return coursePersistencePort.getAll();
  }

  @Override
  public Course findById(Integer id) {
    return coursePersistencePort.findById(id).orElseThrow(
        () -> new EntityNotFoundException()
    );
  }

  @Override
  public Set<Course> getAllWithRegistrationsAndStudents() {
    return coursePersistencePort.getAllWithRegistrationsAndStudents();
  }
}
