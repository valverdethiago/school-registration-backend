package io.metadata.school_registration.infra.repository;

import io.metadata.school_registration.infra.entity.CourseEntity;
import java.util.Set;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "course", path = "course")
public interface CourseRepository extends PagingAndSortingRepository<CourseEntity, Integer> {

  @Query("select e "
      + "   from CourseEntity e "
      + "   join fetch e.registrations as registration "
      + "   join fetch registration.student as student")
  @RestResource(path = "allWithStudents", rel="customSearchMethod")
  Iterable<CourseEntity> findAllWithStudents();

  @Query("select e "
      + "   from CourseEntity e "
      + "   join fetch e.registrations as registration "
      + "   join fetch registration.student as student"
      + "  where student.id = :studentId")
  @RestResource(path = "allCoursesForStudent", rel="customSearchMethod")
  Iterable<CourseEntity> findAllCoursesForStudent(@Param("studentId") Integer studentId);

  @Query("select e "
      + "   from CourseEntity e "
      + "  where e.registrations is empty")
  @RestResource(path = "allCoursesWithoutAnyStudent", rel="customSearchMethod")
  Iterable<CourseEntity> findAllCoursesWithoutAnyStudent();
}
