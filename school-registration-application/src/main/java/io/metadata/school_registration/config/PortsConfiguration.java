package io.metadata.school_registration.config;

import io.metadata.school_registration.domain.ports.api.CourseServicePort;
import io.metadata.school_registration.domain.ports.api.RegistrationServicePort;
import io.metadata.school_registration.domain.ports.api.StudentServicePort;
import io.metadata.school_registration.domain.ports.spi.CoursePersistencePort;
import io.metadata.school_registration.domain.ports.spi.RegistrationPersistencePort;
import io.metadata.school_registration.domain.ports.spi.StudentPersistencePort;
import io.metadata.school_registration.domain.service.CourseServicePortImpl;
import io.metadata.school_registration.domain.service.RegistrationServicePortImpl;
import io.metadata.school_registration.domain.service.StudentServicePortImpl;
import io.metadata.school_registration.infra.adapter.StudentJpaAdapter;
import io.metadata.school_registration.infra.repository.StudentRepository;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PortsConfiguration {

  @Autowired
  private StudentRepository studentRepository;
  @Autowired
  private CoursePersistencePort coursePersistencePort;
  @Autowired
  private RegistrationPersistencePort registrationPersistencePort;
  @Autowired
  private DozerBeanMapper dozerBeanMapper;

  @Bean
  public StudentPersistencePort studentPersistencePort() {
    return new StudentJpaAdapter(studentRepository, dozerBeanMapper);
  }

  @Bean
  public StudentServicePort proposalServicePort() {
    return new StudentServicePortImpl(studentPersistencePort());
  }

  @Bean
  public CourseServicePort courseServicePort() {
    return new CourseServicePortImpl(coursePersistencePort);
  }

  @Bean
  public RegistrationServicePort registrationServicePort() {
    return new RegistrationServicePortImpl(registrationPersistencePort,
        coursePersistencePort, studentPersistencePort());
  }

}
