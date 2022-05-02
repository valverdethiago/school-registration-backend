package io.metadata.school_registration.domain.model;

import io.metadata.school_registration.domain.exception.MaxCoursesPerStudentExceeded;
import io.metadata.school_registration.domain.exception.MaxStudentsPerCourseExceeded;
import io.metadata.school_registration.domain.exception.RegistrationAlreadyExistsException;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
@ToString(of = {"id", "name", "descriptions"})
public class Course {

  public static final Integer MAX_STUDENTS_PER_COURSE_THRESHOLD = 50;
  public static final Integer MAX_COURSES_PER_STUDENT_THRESHOLD = 50;

  private Integer id;
  private String name;
  private String description;
  private Set<Registration> registrations;

  public void addRegistration(Registration registration) {
    if (this.registrations == null) {
      this.registrations = new HashSet<>();
    }
    this.registrations.add(registration);
  }


  public Registration register(Student student) {
    validateStudentAlreadyRegistered(student);
    validateMaxStudentsPerCourseThreshold();
    validateMaxCoursesPerStudentThreshold(student);
    validateStudentAlreadyRegistered(student);
    return createRegistration(student);
  }

  private Registration createRegistration(Student student) {
    Registration registration = Registration.builder()
        .course(this)
        .student(student)
        .build();
    this.addRegistration(registration);
    student.addRegistration(registration);
    return registration;
  }

  private void validateMaxStudentsPerCourseThreshold() {
    if (registrations != null && registrations.size() >= MAX_STUDENTS_PER_COURSE_THRESHOLD) {
      throw new MaxStudentsPerCourseExceeded();
    }
  }

  private void validateMaxCoursesPerStudentThreshold(Student student) {
    if (student.getRegistrations() != null
        && student.getRegistrations().size() >= MAX_COURSES_PER_STUDENT_THRESHOLD) {
      throw new MaxCoursesPerStudentExceeded();
    }
  }

  private void validateStudentAlreadyRegistered(Student student) {
    if(registrations == null) {
      return;
    }
    Optional<Registration> alreadyExistingRegistration = registrations.stream()
        .filter(r -> r.getStudent().equals(student)).findAny();
    alreadyExistingRegistration.ifPresent(r -> {
      throw new RegistrationAlreadyExistsException();
    });
  }

}
