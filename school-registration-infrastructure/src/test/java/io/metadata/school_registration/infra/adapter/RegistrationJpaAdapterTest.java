package io.metadata.school_registration.infra.adapter;

import static io.metadata.school_registration.infra.util.TestFixtures.buildFakeId;
import static io.metadata.school_registration.infra.util.TestFixtures.buildFakeRegistration;
import static io.metadata.school_registration.infra.util.TestFixtures.buildFakeRegistrations;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.metadata.school_registration.domain.model.Registration;
import io.metadata.school_registration.infra.entity.RegistrationEntity;
import io.metadata.school_registration.infra.repository.RegistrationRepository;
import java.util.Optional;
import java.util.Set;
import org.dozer.DozerBeanMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class RegistrationJpaAdapterTest {

  @Mock
  private RegistrationRepository registrationRepository;
  private final DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
  private static RegistrationJpaAdapter adapter;

  @BeforeEach
  public void setup() {
    adapter = new RegistrationJpaAdapter(registrationRepository, dozerBeanMapper);
  }


  @Test
  public void findByIdWithUnknownId() {
    // act
    Optional<Registration> registration = adapter.findById(buildFakeId());
    // assert
    assertTrue(registration.isEmpty());
  }

  @Test
  public void add() {
    // arrange
    RegistrationEntity registrationEntity = buildFakeRegistration();
    Registration registration = dozerBeanMapper.map(registrationEntity, Registration.class);
    when(registrationRepository.save(registrationEntity)).thenReturn(registrationEntity);
    // act
    adapter.add(registration);
    // assert
    verify(registrationRepository).save(registrationEntity);
  }

  @Test
  public void update() {
    // arrange
    RegistrationEntity registrationEntity = buildFakeRegistration();
    Registration registration = dozerBeanMapper.map(registrationEntity, Registration.class);
    when(registrationRepository.save(registrationEntity)).thenReturn(registrationEntity);
    // act
    adapter.update(registration);
    // assert
    verify(registrationRepository).save(registrationEntity);
  }

  @Test
  public void deleteById() {
    // arrange
    RegistrationEntity registration = buildFakeRegistration();
    // act
    adapter.deleteById(registration.getId());
    // assert
    verify(registrationRepository).deleteById(registration.getId());
  }

  @Test
  public void getAll() {
    // arrange
    Set<RegistrationEntity> registrations = buildFakeRegistrations();
    when(registrationRepository.findAll()).thenReturn(registrations);
    // act
    Set<Registration> result = adapter.getAll();
    // assert
    verify(registrationRepository).findAll();
    assertThat(result, hasSize(registrations.size()));
  }

  @Test
  public void findById() {
    // arrange
    RegistrationEntity registration = buildFakeRegistration();
    when(registrationRepository.findById(registration.getId())).thenReturn(Optional.of(registration));
    // act
    Optional<Registration> result = adapter.findById(registration.getId());
    // assert
    verify(registrationRepository).findById(registration.getId());
    assertTrue(result.isPresent());
    assertThat(result.get().getId(), equalTo(registration.getId()));
  }


}
