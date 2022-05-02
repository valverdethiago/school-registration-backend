package io.metadata.school_registration.infra.adapter;

import static io.metadata.school_registration.infra.util.TestFixtures.buildFakeCourse;
import static io.metadata.school_registration.infra.util.TestFixtures.buildFakeCourses;
import static io.metadata.school_registration.infra.util.TestFixtures.buildFakeId;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.metadata.school_registration.domain.model.Course;
import io.metadata.school_registration.infra.entity.CourseEntity;
import io.metadata.school_registration.infra.repository.CourseRepository;
import java.util.Optional;
import java.util.Set;
import org.dozer.DozerBeanMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CourseJpaAdapterTest {

  @Mock
  private CourseRepository courseRepository;
  private final DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
  private static CourseJpaAdapter adapter;

  @BeforeEach
  public void setup() {
    adapter = new CourseJpaAdapter(courseRepository, dozerBeanMapper);
  }


  @Test
  public void findByIdWithUnknownId() {
    // act
    Optional<Course> course = adapter.findById(buildFakeId());
    // assert
    assertTrue(course.isEmpty());
  }

  @Test
  public void add() {
    // arrange
    CourseEntity courseEntity = buildFakeCourse();
    Course course = dozerBeanMapper.map(courseEntity, Course.class);
    when(courseRepository.save(courseEntity)).thenReturn(courseEntity);
    // act
    adapter.add(course);
    // assert
    verify(courseRepository).save(courseEntity);
  }

  @Test
  public void update() {
    // arrange
    CourseEntity courseEntity = buildFakeCourse();
    Course course = dozerBeanMapper.map(courseEntity, Course.class);
    when(courseRepository.save(courseEntity)).thenReturn(courseEntity);
    // act
    adapter.update(course);
    // assert
    verify(courseRepository).save(courseEntity);
  }

  @Test
  public void deleteById() {
    // arrange
    CourseEntity course = buildFakeCourse();
    // act
    adapter.deleteById(course.getId());
    // assert
    verify(courseRepository).deleteById(course.getId());
  }

  @Test
  public void getAll() {
    // arrange
    Set<CourseEntity> courses = buildFakeCourses();
    when(courseRepository.findAll()).thenReturn(courses);
    // act
    Set<Course> result = adapter.getAll();
    // assert
    verify(courseRepository).findAll();
    assertThat(result, hasSize(courses.size()));
  }

  @Test
  public void findById() {
    // arrange
    CourseEntity course = buildFakeCourse();
    when(courseRepository.findById(course.getId())).thenReturn(Optional.of(course));
    // act
    Optional<Course> result = adapter.findById(course.getId());
    // assert
    verify(courseRepository).findById(course.getId());
    assertTrue(result.isPresent());
    assertThat(result.get().getId(), equalTo(course.getId()));
  }

  @Test
  public void getAllWithRegistrationsAndStudents() {
    // arrange
    Set<CourseEntity> courses = buildFakeCourses();
    when(courseRepository.findAllWithStudents()).thenReturn(courses);
    // act
    Set<Course> result = adapter.getAllWithRegistrationsAndStudents();
    // assert
    verify(courseRepository).findAllWithStudents();
    assertThat(result, hasSize(courses.size()));
  }


}
