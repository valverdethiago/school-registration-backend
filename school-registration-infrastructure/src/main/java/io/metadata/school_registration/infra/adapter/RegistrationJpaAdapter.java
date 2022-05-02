package io.metadata.school_registration.infra.adapter;

import com.google.common.collect.Streams;
import io.metadata.school_registration.domain.model.Registration;
import io.metadata.school_registration.domain.ports.spi.RegistrationPersistencePort;
import io.metadata.school_registration.infra.entity.RegistrationEntity;
import io.metadata.school_registration.infra.repository.RegistrationRepository;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RegistrationJpaAdapter implements RegistrationPersistencePort {

  @Autowired
  private final RegistrationRepository registrationRepository;
  private final DozerBeanMapper dozerBeanMapper;

  @Override
  public Registration add(Registration course) {
    RegistrationEntity entity = dozerBeanMapper.map(course, RegistrationEntity.class);
    RegistrationEntity savedEntity = registrationRepository.save(entity);
    return dozerBeanMapper.map(savedEntity, Registration.class);
  }

  @Override
  public Registration update(Registration course) {
    return add(course);
  }

  @Override
  public void deleteById(Integer id) {
    registrationRepository.deleteById(id);
  }

  @Override
  public Set<Registration> getAll() {
    Iterable<RegistrationEntity> entities = registrationRepository.findAll();
    return Streams.stream(entities)
        .map(e->dozerBeanMapper.map(e, Registration.class))
        .collect(Collectors.toSet());
  }

  @Override
  public Optional<Registration> findById(Integer id) {
    Optional<RegistrationEntity> entity = registrationRepository.findById(id);
    return entity.map(
        e -> dozerBeanMapper.map(e, Registration.class));
  }
}
