package io.metadata.school_registration.infra.adapter;

import com.google.common.collect.Streams;
import io.metadata.school_registration.domain.model.Student;
import io.metadata.school_registration.domain.ports.spi.StudentPersistencePort;
import io.metadata.school_registration.infra.entity.StudentEntity;
import io.metadata.school_registration.infra.repository.StudentRepository;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StudentJpaAdapter implements StudentPersistencePort {

  @Autowired
  private final StudentRepository studentRepository;
  private final DozerBeanMapper dozerBeanMapper;

  @Override
  public Student add(Student student) {
    StudentEntity entity = dozerBeanMapper.map(student, StudentEntity.class);
    StudentEntity savedEntity = studentRepository.save(entity);
    return dozerBeanMapper.map(savedEntity, Student.class);
  }

  @Override
  public Student update(Student student) {
    return add(student);
  }

  @Override
  public void deleteById(Integer id) {
    studentRepository.deleteById(id);
  }

  @Override
  public Set<Student> getAll() {
    Iterable<StudentEntity> entities = studentRepository.findAll();
    return Streams.stream(entities)
        .map(e->dozerBeanMapper.map(e, Student.class))
        .collect(Collectors.toSet());
  }

  @Override
  public Optional<Student> findById(Integer id) {
    Optional<StudentEntity> entity = studentRepository.findById(id);
    return entity.map(e -> dozerBeanMapper.map(e, Student.class));
  }

  @Override
  public Set<Student> findAllStudentsRegisteredToCourse(Integer courseId) {
    Iterable<StudentEntity> entities = studentRepository.findAllStudentsRegisteredToCourse(courseId);
    return Streams.stream(entities)
        .map(e->dozerBeanMapper.map(e, Student.class))
        .collect(Collectors.toSet());
  }

  @Override
  public Set<Student> findAllStudentsWithoutAnyCourses() {
    Iterable<StudentEntity> entities = studentRepository.findAllStudentsWithoutAnyCourses();
    return Streams.stream(entities)
        .map(e->dozerBeanMapper.map(e, Student.class))
        .collect(Collectors.toSet());
  }
}
