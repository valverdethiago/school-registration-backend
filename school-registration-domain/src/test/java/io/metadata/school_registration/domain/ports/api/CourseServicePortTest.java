package io.metadata.school_registration.domain.ports.api;

import static org.junit.jupiter.api.Assertions.*;
import static io.metadata.school_registration.util.TestFixtures.*;


import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.metadata.school_registration.domain.exception.EntityNotFoundException;
import io.metadata.school_registration.domain.model.Course;
import io.metadata.school_registration.domain.ports.spi.CoursePersistencePort;
import io.metadata.school_registration.domain.service.CourseServicePortImpl;
import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CourseServicePortTest {

  @Mock
  private CoursePersistencePort coursePersistencePort;
  @InjectMocks
  private CourseServicePortImpl servicePort;

  @Test
  public void findByIdWithUnknownId() {
    // act and assert
    assertThrows(EntityNotFoundException.class, () -> servicePort.findById(buildFakeId()));
  }

  @Test
  public void add() {
    // arrange
    Course course = buildFakeCourse(false);
    // act
    servicePort.add(course);
    // assert
    verify(coursePersistencePort).add(course);
  }

  @Test
  public void update() {
    // arrange
    Course course = buildFakeCourse();
    // act
    servicePort.update(course);
    // assert
    verify(coursePersistencePort).update(course);
  }

  @Test
  public void deleteById() {
    // arrange
    Course course = buildFakeCourse();
    // act
    servicePort.deleteById(course.getId());
    // assert
    verify(coursePersistencePort).deleteById(course.getId());
  }

  @Test
  public void getAll() {
    // arrange
    Set<Course> courses = buildFakeCourses();
    when(coursePersistencePort.getAll()).thenReturn(courses);
    // act
    Set<Course> result = servicePort.getAll();
    // assert
    verify(coursePersistencePort).getAll();
    assertThat(result, hasSize(courses.size()));
  }

  @Test
  public void findById() {
    // arrange
    Course course = buildFakeCourse();
    when(coursePersistencePort.findById(course.getId())).thenReturn(Optional.of(course));
    // act
    Course result = servicePort.findById(course.getId());
    // assert
    verify(coursePersistencePort).findById(course.getId());
    assertThat(result, equalTo(course));
  }

  @Test
  public void getAllWithRegistrationsAndStudents() {
    // arrange
    Set<Course> courses = buildFakeCourses();
    when(coursePersistencePort.getAllWithRegistrationsAndStudents()).thenReturn(courses);
    // act
    Set<Course> result = servicePort.getAllWithRegistrationsAndStudents();
    // assert
    verify(coursePersistencePort).getAllWithRegistrationsAndStudents();
    assertThat(result, hasSize(courses.size()));
  }

}
