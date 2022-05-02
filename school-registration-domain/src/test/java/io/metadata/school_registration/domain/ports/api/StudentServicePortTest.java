package io.metadata.school_registration.domain.ports.api;

import static io.metadata.school_registration.util.TestFixtures.buildFakeId;
import static io.metadata.school_registration.util.TestFixtures.buildFakeStudent;
import static io.metadata.school_registration.util.TestFixtures.buildFakeStudents;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.metadata.school_registration.domain.exception.EntityNotFoundException;
import io.metadata.school_registration.domain.model.Student;
import io.metadata.school_registration.domain.ports.spi.StudentPersistencePort;
import io.metadata.school_registration.domain.service.StudentServicePortImpl;
import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StudentServicePortTest {

  @Mock
  private StudentPersistencePort studentPersistencePort;
  @InjectMocks
  private StudentServicePortImpl servicePort;

  @Test
  public void findByIdWithUnknownId() {
    // act and assert
    assertThrows(EntityNotFoundException.class, () -> servicePort.findById(buildFakeId()));
  }

  @Test
  public void add() {
    // arrange
    Student student = buildFakeStudent(false);
    // act
    servicePort.add(student);
    // assert
    verify(studentPersistencePort).add(student);
  }

  @Test
  public void update() {
    // arrange
    Student student = buildFakeStudent();
    // act
    servicePort.update(student);
    // assert
    verify(studentPersistencePort).update(student);
  }

  @Test
  public void deleteById() {
    // arrange
    Student student = buildFakeStudent();
    // act
    servicePort.deleteById(student.getId());
    // assert
    verify(studentPersistencePort).deleteById(student.getId());
  }

  @Test
  public void getAll() {
    // arrange
    Set<Student> students = buildFakeStudents();
    when(studentPersistencePort.getAll()).thenReturn(students);
    // act
    Set<Student> result = servicePort.getAll();
    // assert
    verify(studentPersistencePort).getAll();
    assertThat(result, hasSize(students.size()));
  }

  @Test
  public void findById() {
    // arrange
    Student student = buildFakeStudent();
    when(studentPersistencePort.findById(student.getId())).thenReturn(Optional.of(student));
    // act
    Student result = servicePort.findById(student.getId());
    // assert
    verify(studentPersistencePort).findById(student.getId());
    assertThat(result, equalTo(student));
  }

}
