package io.metadata.school_registration.infra.repository;

import io.metadata.school_registration.infra.entity.CourseEntity;
import io.metadata.school_registration.infra.entity.RegistrationEntity;
import io.metadata.school_registration.infra.entity.StudentEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;

@RepositoryRestResource(collectionResourceRel = "registration", path = "registration", excerptProjection = RegistrationProjection.class)
public interface RegistrationRepository extends PagingAndSortingRepository<RegistrationEntity, Integer> {

}

@Projection(name="allChildren", types=RegistrationEntity.class)
interface RegistrationProjection {
  Integer getId();
  StudentEntity getStudent();
  CourseEntity getCourse();
}
