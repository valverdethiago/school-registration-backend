package io.metadata.school_registration.dto;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
@AllArgsConstructor
public class CourseDto {
  private final String name;
  private final String description;
  @Singular
  private final Set<String> students;

}
