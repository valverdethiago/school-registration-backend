package io.metadata.school_registration.domain.ports.api;

import io.metadata.school_registration.domain.model.Student;
import java.util.Set;

public interface StudentServicePort {

  Student add(Student student);
  Student update(Student student);
  void deleteById(Integer id);
  Set<Student> getAll();
  Student findById(Integer id);
}
