package io.metadata.school_registration.infra.adapter;

import static io.metadata.school_registration.infra.util.TestFixtures.buildFakeStudent;
import static io.metadata.school_registration.infra.util.TestFixtures.buildFakeStudents;
import static io.metadata.school_registration.infra.util.TestFixtures.buildFakeId;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.metadata.school_registration.domain.model.Student;
import io.metadata.school_registration.infra.entity.StudentEntity;
import io.metadata.school_registration.infra.repository.StudentRepository;
import java.util.Optional;
import java.util.Set;
import org.dozer.DozerBeanMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class StudentJpaAdapterTest {

  @Mock
  private StudentRepository studentRepository;
  private final DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
  private static StudentJpaAdapter adapter;

  @BeforeEach
  public void setup() {
    adapter = new StudentJpaAdapter(studentRepository, dozerBeanMapper);
  }


  @Test
  public void findByIdWithUnknownId() {
    // act
    Optional<Student> student = adapter.findById(buildFakeId());
    // assert
    assertTrue(student.isEmpty());
  }

  @Test
  public void add() {
    // arrange
    StudentEntity studentEntity = buildFakeStudent();
    Student student = dozerBeanMapper.map(studentEntity, Student.class);
    when(studentRepository.save(studentEntity)).thenReturn(studentEntity);
    // act
    adapter.add(student);
    // assert
    verify(studentRepository).save(studentEntity);
  }

  @Test
  public void update() {
    // arrange
    StudentEntity studentEntity = buildFakeStudent();
    Student student = dozerBeanMapper.map(studentEntity, Student.class);
    when(studentRepository.save(studentEntity)).thenReturn(studentEntity);
    // act
    adapter.update(student);
    // assert
    verify(studentRepository).save(studentEntity);
  }

  @Test
  public void deleteById() {
    // arrange
    StudentEntity student = buildFakeStudent();
    // act
    adapter.deleteById(student.getId());
    // assert
    verify(studentRepository).deleteById(student.getId());
  }

  @Test
  public void getAll() {
    // arrange
    Set<StudentEntity> students = buildFakeStudents();
    when(studentRepository.findAll()).thenReturn(students);
    // act
    Set<Student> result = adapter.getAll();
    // assert
    verify(studentRepository).findAll();
    assertThat(result, hasSize(students.size()));
  }

  @Test
  public void findById() {
    // arrange
    StudentEntity student = buildFakeStudent();
    when(studentRepository.findById(student.getId())).thenReturn(Optional.of(student));
    // act
    Optional<Student> result = adapter.findById(student.getId());
    // assert
    verify(studentRepository).findById(student.getId());
    assertTrue(result.isPresent());
    assertThat(result.get().getId(), equalTo(student.getId()));
  }


}
