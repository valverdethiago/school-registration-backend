package io.metadata.school_registration.config;

import io.metadata.school_registration.infra.entity.RegistrationEntity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("io.metadata.school_registration.infra.repository")
@Configuration
@EntityScan(basePackageClasses = RegistrationEntity.class)
public class PersistenceConfiguration {

}
