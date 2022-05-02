package io.metadata.school_registration.domain.model;

import io.metadata.school_registration.domain.exception.MaxCoursesPerStudentExceeded;
import io.metadata.school_registration.domain.exception.MaxStudentsPerCourseExceeded;
import io.metadata.school_registration.domain.exception.RegistrationAlreadyExistsException;
import org.junit.jupiter.api.Test;

import static io.metadata.school_registration.util.TestFixtures.*;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.equalTo;

class CourseTest {

  @Test
  void addRegistrationWithStudentAlreadyRegistered() {
    // arrange
    Course course = buildFakeCourse();
    Student student = buildFakeStudent();
    course.register(student);
    // Act and Assert
    assertThrows(RegistrationAlreadyExistsException.class,
        () -> course.register(student));
  }

  @Test
  void addRegistrationWithMaxStudentsReached() {
    // arrange
    Course course = buildFakeCourse();
    for(int i=0; i< Course.MAX_STUDENTS_PER_COURSE_THRESHOLD; i++) {
      course.register(buildFakeStudent());
    }
    // Act and Assert
    assertThrows(MaxStudentsPerCourseExceeded.class,
        () -> course.register(buildFakeStudent()));
  }

  @Test
  void addRegistrationWithMaxCoursesPerStudentReached() {
    // arrange
    Student student = buildFakeStudent();
    for(int i=0; i< Course.MAX_COURSES_PER_STUDENT_THRESHOLD; i++) {
      buildFakeCourse().register(student);
    }
    // Act and Assert
    assertThrows(MaxCoursesPerStudentExceeded.class,
        () -> buildFakeCourse().register(student));
  }

  @Test
  void register() {
    // arrange
    Student student = buildFakeStudent();
    Course course = buildFakeCourse();
    // act
    Registration registration = course.register(student);
    // assert
    assertThat(registration.getCourse(), equalTo(course));
    assertThat(registration.getStudent(), equalTo(student));
    assertThat(course.getRegistrations(), hasSize(1));
    assertThat(student.getRegistrations(), hasSize(1));
  }
}
