package io.metadata.school_registration.domain.ports.spi;

import io.metadata.school_registration.domain.model.Registration;
import java.util.Optional;
import java.util.Set;

public interface RegistrationPersistencePort {

  Registration add(Registration student);
  Registration update(Registration student);
  void deleteById(Integer id);
  Set<Registration> getAll();
  Optional<Registration> findById(Integer id);
}
