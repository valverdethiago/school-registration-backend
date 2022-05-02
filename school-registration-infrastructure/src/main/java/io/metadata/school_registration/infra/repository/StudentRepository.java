package io.metadata.school_registration.infra.repository;

import io.metadata.school_registration.infra.entity.StudentEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "student", path = "student")
public interface StudentRepository extends PagingAndSortingRepository<StudentEntity, Integer> {

  @Query("select e "
      + "   from StudentEntity e "
      + "   join fetch e.registrations as registration "
      + "   join fetch registration.course as course"
      + "  where course.id = :courseId")
  @RestResource(path = "allStudentsForCourse", rel="customSearchMethod")
  Iterable<StudentEntity> findAllStudentsRegisteredToCourse(@Param("courseId") Integer courseId);

  @Query("select e "
      + "   from StudentEntity e "
      + "  where e.registrations is empty")
  @RestResource(path = "allStudentsWithoutAnyCourse", rel="customSearchMethod")
  Iterable<StudentEntity> findAllStudentsWithoutAnyCourses();
}
