package io.metadata.school_registration.domain.service;

import io.metadata.school_registration.domain.exception.EntityNotFoundException;
import io.metadata.school_registration.domain.model.Course;
import io.metadata.school_registration.domain.model.Registration;
import io.metadata.school_registration.domain.model.Student;
import io.metadata.school_registration.domain.ports.api.RegistrationServicePort;
import io.metadata.school_registration.domain.ports.spi.CoursePersistencePort;
import io.metadata.school_registration.domain.ports.spi.RegistrationPersistencePort;
import io.metadata.school_registration.domain.ports.spi.StudentPersistencePort;
import java.util.Set;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RegistrationServicePortImpl implements RegistrationServicePort {

  private final RegistrationPersistencePort registrationPersistencePort;
  private final CoursePersistencePort coursePersistencePort;
  private final StudentPersistencePort studentPersistencePort;

  @Override
  public Registration add(Registration registration) {
//    registration.removeChildren();
    return registrationPersistencePort.add(registration);
  }

  @Override
  public Registration update(Registration registration) {
    return registrationPersistencePort.update(registration);
  }

  @Override
  public void deleteById(Integer id) {
    registrationPersistencePort.deleteById(id);
  }

  @Override
  public Set<Registration> getAll() {
    return registrationPersistencePort.getAll();
  }

  @Override
  public Registration findById(Integer id) {
    return registrationPersistencePort.findById(id)
        .orElseThrow(EntityNotFoundException::new);
  }

  @Override
  public Registration register(Integer courseId, Integer studentId) {
    Course course = validateCourseExists(courseId);
    Student student = validateStudentExists(studentId);
    Registration registration = course.register(student);
    return this.add(registration);
  }

  private Course validateCourseExists(Integer courseId) {
    return coursePersistencePort
        .findById(courseId)
        .orElseThrow(EntityNotFoundException::new);
  }

  private Student validateStudentExists(Integer studentId) {
    return studentPersistencePort
        .findById(studentId)
        .orElseThrow(EntityNotFoundException::new);
  }
}
