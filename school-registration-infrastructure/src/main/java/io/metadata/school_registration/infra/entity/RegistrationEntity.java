package io.metadata.school_registration.infra.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "registrations")
@EqualsAndHashCode(of = "id")
public class RegistrationEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "student_id")
  private StudentEntity student;
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "course_id")
  private CourseEntity course;

}

