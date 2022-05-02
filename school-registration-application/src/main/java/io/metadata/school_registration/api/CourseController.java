package io.metadata.school_registration.api;

import io.metadata.school_registration.domain.model.Course;
import io.metadata.school_registration.domain.ports.api.CourseServicePort;
import io.metadata.school_registration.dto.CourseDto;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//@RestController
//@RequestMapping("/course")
public class CourseController {

  private final CourseServicePort service;

  @GetMapping("/allWithStudents")
  public ResponseEntity<Set<CourseDto>> list() {
    Set<Course> courses = service.getAllWithRegistrationsAndStudents();
    if (CollectionUtils.isEmpty(courses)) {
      return ResponseEntity.noContent().build();
    }
    Set<CourseDto> dtos = this.convertToDtos(courses);
    return new ResponseEntity<>(dtos, HttpStatus.OK);
  }

  private Set<CourseDto> convertToDtos(Set<Course> courses) {
    final Set<CourseDto> result = new HashSet<>();
    courses.forEach(course -> {
      result.add(CourseDto.builder()
          .name(course.getName())
          .description(course.getDescription())
          .students(course.getRegistrations().stream()
              .map(registration -> registration.getStudent().getName())
              .collect(Collectors.toSet()))
          .build());
    });
    return result;
  }


}
