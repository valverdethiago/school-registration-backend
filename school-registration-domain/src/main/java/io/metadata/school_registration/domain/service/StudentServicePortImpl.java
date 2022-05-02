package io.metadata.school_registration.domain.service;

import io.metadata.school_registration.domain.exception.EntityNotFoundException;
import io.metadata.school_registration.domain.model.Student;
import io.metadata.school_registration.domain.ports.api.StudentServicePort;
import io.metadata.school_registration.domain.ports.spi.StudentPersistencePort;
import java.util.Set;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StudentServicePortImpl implements StudentServicePort {

  private final StudentPersistencePort studentPersistencePort;



  @Override
  public Student add(Student student) {
    return studentPersistencePort.add(student);
  }

  @Override
  public Student update(Student student) {
    return studentPersistencePort.update(student);
  }

  @Override
  public void deleteById(Integer id) {
    studentPersistencePort.deleteById(id);
  }

  @Override
  public Set<Student> getAll() {
    return studentPersistencePort.getAll();
  }

  @Override
  public Student findById(Integer id) {
    return studentPersistencePort.findById(id).orElseThrow(
        () -> new EntityNotFoundException()
    );
  }
}
