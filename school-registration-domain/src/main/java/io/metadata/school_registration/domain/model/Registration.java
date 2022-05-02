package io.metadata.school_registration.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"student", "course"})
@ToString(of = {"id", "student", "course"})
public class Registration {

  private Integer id;
  private Student student;
  private Course course;

}
