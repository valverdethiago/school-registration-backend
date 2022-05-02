package io.metadata.school_registration.domain.ports.spi;

import io.metadata.school_registration.domain.model.Student;
import java.util.Optional;
import java.util.Set;

public interface StudentPersistencePort {

  Student add(Student student);
  Student update(Student student);
  void deleteById(Integer id);
  Set<Student> getAll();
  Optional<Student> findById(Integer id);
  Set<Student> findAllStudentsRegisteredToCourse(Integer courseId);
  Set<Student> findAllStudentsWithoutAnyCourses();
}
