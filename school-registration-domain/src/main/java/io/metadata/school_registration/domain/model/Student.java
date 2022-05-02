package io.metadata.school_registration.domain.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
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
@EqualsAndHashCode(of = "id")
@ToString(of = {"id", "name"})
public class Student implements Serializable {

  private Integer id;
  private String name;
  private Set<Registration> registrations;

  public void addRegistration(Registration registration) {
    if(this.registrations == null)
      this.registrations = new HashSet<>();
    this.registrations.add(registration);
  }

}
