package io.metadata.school_registration.infra.adapter;

import com.google.common.collect.Streams;
import io.metadata.school_registration.domain.model.Course;
import io.metadata.school_registration.domain.ports.spi.CoursePersistencePort;
import io.metadata.school_registration.infra.entity.CourseEntity;
import io.metadata.school_registration.infra.repository.CourseRepository;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseJpaAdapter implements CoursePersistencePort {

  private final CourseRepository courseRepository;
  private final DozerBeanMapper dozerBeanMapper;

  @Override
  public Course add(Course course) {
    CourseEntity entity = dozerBeanMapper.map(course, CourseEntity.class);
    CourseEntity savedEntity = courseRepository.save(entity);
    return dozerBeanMapper.map(savedEntity, Course.class);
  }

  @Override
  public Course update(Course student) {
    return add(student);
  }

  @Override
  public void deleteById(Integer id) {
    courseRepository.deleteById(id);
  }

  @Override
  public Set<Course> getAll() {
    Iterable<CourseEntity> entities = courseRepository.findAll();
    return Streams.stream(entities)
        .map(e->dozerBeanMapper.map(e, Course.class))
        .collect(Collectors.toSet());
  }

  @Override
  public Optional<Course> findById(Integer id) {
    Optional<CourseEntity> entity = courseRepository.findById(id);
    return entity.map(
        e -> dozerBeanMapper.map(e, Course.class));
  }

  @Override
  public Set<Course> getAllWithRegistrationsAndStudents() {
    Iterable<CourseEntity> entities = courseRepository.findAllWithStudents();
    return Streams.stream(entities)
        .map(e->dozerBeanMapper.map(e, Course.class))
        .collect(Collectors.toSet());
  }

  @Override
  public Set<Course> findAllCoursesForStudent(Integer studentId) {
    Iterable<CourseEntity> entities = courseRepository.findAllCoursesForStudent(studentId);
    return Streams.stream(entities)
        .map(e->dozerBeanMapper.map(e, Course.class))
        .collect(Collectors.toSet());
  }

  @Override
  public Set<Course> findAllCoursesWithoutAnyStudent() {
    Iterable<CourseEntity> entities = courseRepository.findAllCoursesWithoutAnyStudent();
    return Streams.stream(entities)
        .map(e->dozerBeanMapper.map(e, Course.class))
        .collect(Collectors.toSet());
  }
}
