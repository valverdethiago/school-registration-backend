package io.metadata.school_registration.api;

import io.metadata.school_registration.domain.model.Registration;
import io.metadata.school_registration.domain.ports.api.RegistrationServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/registration")
public class RegistrationController {

  private final RegistrationServicePort service;

  @PostMapping("/{courseId}/{studentId}")
  public ResponseEntity<Registration> register(
      @PathVariable("courseId") Integer courseId,
      @PathVariable("studentId") Integer studentId) {
    Registration registration = service.register(courseId, studentId);
    return ResponseEntity.ok(registration);
  }


}
