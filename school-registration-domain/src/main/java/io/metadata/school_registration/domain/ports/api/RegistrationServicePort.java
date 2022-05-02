package io.metadata.school_registration.domain.ports.api;

import io.metadata.school_registration.domain.model.Registration;
import java.util.Set;

public interface RegistrationServicePort {

  Registration add(Registration student);
  Registration update(Registration student);
  void deleteById(Integer id);
  Set<Registration> getAll();
  Registration findById(Integer id);
  Registration register(Integer courseId, Integer studentId);
}
