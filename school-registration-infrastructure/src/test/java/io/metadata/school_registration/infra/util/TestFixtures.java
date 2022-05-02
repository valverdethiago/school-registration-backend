package io.metadata.school_registration.infra.util;

import com.github.javafaker.Faker;
import io.metadata.school_registration.infra.entity.CourseEntity;
import io.metadata.school_registration.infra.entity.RegistrationEntity;
import io.metadata.school_registration.infra.entity.StudentEntity;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestFixtures {

  private static final Random RANDOMIZER = new Random();
  private static final Faker faker = new Faker();

  private static final String NAME_PATTERN = "Mastering %s";
  private static final String DESCRIPTION_PATTERN = "Learn how to make the best %s in the world";

  public static Set<RegistrationEntity> buildFakeRegistrations() {
    return buildFakeRegistrations(RANDOMIZER.nextInt(50)+1);
  }

  public static Set<RegistrationEntity> buildFakeRegistrations(int size) {
    return IntStream.rangeClosed(0, size)
        .mapToObj(i -> buildFakeRegistration(buildFakeCourse(), buildFakeStudent()))
        .collect(Collectors.toSet());
  }

  public static Set<CourseEntity> buildFakeCourses() {
    return buildFakeCourses(RANDOMIZER.nextInt(50)+1);
  }

  public static Set<CourseEntity> buildFakeCourses(int size) {
    return IntStream.rangeClosed(0, size)
        .mapToObj(i -> buildFakeCourse())
        .collect(Collectors.toSet());
  }
  public static Set<StudentEntity> buildFakeStudents() {
    return buildFakeStudents(RANDOMIZER.nextInt(50)+1);
  }

  public static Set<StudentEntity> buildFakeStudents(int size) {
    return IntStream.rangeClosed(0, size)
        .mapToObj(i -> buildFakeStudent())
        .collect(Collectors.toSet());
  }

  public static CourseEntity buildFakeCourse() {
    return buildFakeCourse(true);
  }

  public static CourseEntity buildFakeCourse(boolean withId) {
    final String dish = faker.food().dish();
    return CourseEntity.builder()
        .id(withId ? buildFakeId() : null)
        .name(String.format(NAME_PATTERN, dish))
        .description(String.format(DESCRIPTION_PATTERN, dish))
        .build();
  }

  public static Integer buildFakeId() {
    return RANDOMIZER.nextInt();
  }

  public static StudentEntity buildFakeStudent() {
    return buildFakeStudent(true);
  }

  public static StudentEntity buildFakeStudent(boolean withId) {
    return StudentEntity.builder()
        .id(withId ? buildFakeId() : null)
        .name(faker.name().fullName())
        .build();
  }

  public static RegistrationEntity buildFakeRegistration() {
    return buildFakeRegistration(true);
  }

  public static RegistrationEntity buildFakeRegistration(boolean withId) {
    return buildFakeRegistration(buildFakeCourse(), buildFakeStudent(), withId);
  }


  public static RegistrationEntity buildFakeRegistration(CourseEntity course, StudentEntity student) {
    return buildFakeRegistration(course, student, true);
  }

  public static RegistrationEntity buildFakeRegistration(CourseEntity course, StudentEntity student, boolean withId) {
    return RegistrationEntity.builder()
        .id(withId ? buildFakeId() : null)
        .student(student)
        .course(course)
        .build();
  }


}
