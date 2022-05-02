package io.metadata.school_registration.domain.ports.api;

import static io.metadata.school_registration.util.TestFixtures.buildFakeCourse;
import static io.metadata.school_registration.util.TestFixtures.buildFakeCourses;
import static io.metadata.school_registration.util.TestFixtures.buildFakeId;
import static io.metadata.school_registration.util.TestFixtures.buildFakeRegistrations;
import static io.metadata.school_registration.util.TestFixtures.buildFakeStudent;
import static io.metadata.school_registration.util.TestFixtures.buildRegistration;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.isNotNull;
import static org.mockito.ArgumentMatchers.notNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.metadata.school_registration.domain.exception.EntityNotFoundException;
import io.metadata.school_registration.domain.model.Course;
import io.metadata.school_registration.domain.model.Registration;
import io.metadata.school_registration.domain.model.Student;
import io.metadata.school_registration.domain.ports.spi.CoursePersistencePort;
import io.metadata.school_registration.domain.ports.spi.RegistrationPersistencePort;
import io.metadata.school_registration.domain.ports.spi.StudentPersistencePort;
import io.metadata.school_registration.domain.service.CourseServicePortImpl;
import io.metadata.school_registration.domain.service.RegistrationServicePortImpl;
import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RegistrationServicePortTest {

  @Mock
  private RegistrationPersistencePort registrationPersistencePort;
  @Mock
  private CoursePersistencePort coursePersistencePort;
  @Mock
  private StudentPersistencePort studentPersistencePort;
  @InjectMocks
  private RegistrationServicePortImpl servicePort;

  @Test
  public void findByIdWithUnknownId() {
    // act and assert
    assertThrows(EntityNotFoundException.class, () -> servicePort.findById(buildFakeId()));
  }

  @Test
  public void add() {
    // arrange
    Registration registration = buildRegistration(buildFakeCourse(), buildFakeStudent(), false);
    // act
    servicePort.add(registration);
    // assert
    verify(registrationPersistencePort).add(registration);
  }

  @Test
  public void update() {
    // arrange
    Registration registration = buildRegistration(buildFakeCourse(), buildFakeStudent());
    // act
    servicePort.update(registration);
    // assert
    verify(registrationPersistencePort).update(registration);
  }

  @Test
  public void deleteById() {
    // arrange
    Registration registration = buildRegistration(buildFakeCourse(), buildFakeStudent());
    // act
    servicePort.deleteById(registration.getId());
    // assert
    verify(registrationPersistencePort).deleteById(registration.getId());
  }

  @Test
  public void getAll() {
    // arrange
    Set<Registration> registrations  = buildFakeRegistrations();
    when(registrationPersistencePort.getAll()).thenReturn(registrations);
    // act
    Set<Registration> result = servicePort.getAll();
    // assert
    verify(registrationPersistencePort).getAll();
    assertThat(result, hasSize(registrations.size()));
  }

  @Test
  public void findById() {
    // arrange
    Registration registration = buildRegistration(buildFakeCourse(), buildFakeStudent());
    when(registrationPersistencePort.findById(registration.getId())).thenReturn(Optional.of(registration));
    // act
    Registration result = servicePort.findById(registration.getId());
    // assert
    verify(registrationPersistencePort).findById(registration.getId());
    assertThat(result, equalTo(registration));
  }

  @Test
  public void registerWithUnknownCourse() {
    // arrange
    Integer courseId = buildFakeId();
    Integer studentId = buildFakeId();
    when(coursePersistencePort.findById(courseId)).thenReturn(Optional.empty());
    // act and assert
    assertThrows(EntityNotFoundException.class, () -> servicePort.register(courseId, studentId));
  }
  @Test
  public void registerWithUnknownStudent() {
    // arrange
    Course course = buildFakeCourse();
    Integer studentId = buildFakeId();
    when(coursePersistencePort.findById(course.getId())).thenReturn(Optional.of(course));
    when(studentPersistencePort.findById(studentId)).thenReturn(Optional.empty());
    // act and assert
    assertThrows(EntityNotFoundException.class, () -> servicePort.register(course.getId(), studentId));
  }
  @Test
  public void register() {
    // arrange
    Course course = buildFakeCourse();
    Student student = buildFakeStudent();
    Registration registration = buildRegistration(course, student);
    when(coursePersistencePort.findById(course.getId())).thenReturn(Optional.of(course));
    when(studentPersistencePort.findById(student.getId())).thenReturn(Optional.of(student));
    when(registrationPersistencePort.add(any())).thenReturn(registration);
    // act
    Registration result = servicePort.register(course.getId(), student.getId());
    // assert
    assertThat(result, is(notNullValue()));
    assertThat(result.getCourse(), equalTo(course));
    assertThat(result.getStudent(), equalTo(student));
  }

}
