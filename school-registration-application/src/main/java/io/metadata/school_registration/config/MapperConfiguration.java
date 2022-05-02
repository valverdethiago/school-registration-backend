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
public class MapperConfiguration {

  @Bean
  public DozerBeanMapper dozerBeanMapper() {
    return new DozerBeanMapper();
  }

}
