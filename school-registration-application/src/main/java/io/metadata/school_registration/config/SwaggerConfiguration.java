package io.metadata.school_registration.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@OpenAPIDefinition(info = @Info(title = "School Registration API",
    version = "0.0.1-SNAPSHOT",
    description = "School Registration"))
public class SwaggerConfiguration implements WebMvcConfigurer {

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addRedirectViewController("/", "/swagger-ui.html");
    registry.addRedirectViewController("/swagger-ui", "/swagger-ui.html");
  }
}
