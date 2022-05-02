package io.metadata.school_registration.launcher;

import io.metadata.school_registration.config.AppConfiguration;
import io.metadata.school_registration.config.PersistenceConfiguration;
import io.metadata.school_registration.config.PortsConfiguration;
import io.metadata.school_registration.config.SwaggerConfiguration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({PortsConfiguration.class, PersistenceConfiguration.class,
    AppConfiguration.class, SwaggerConfiguration.class})
public class SchoolRegistrationLauncher {

  public static void main(String[] args) {
    SpringApplication.run(SchoolRegistrationLauncher.class, args);
  }

}
