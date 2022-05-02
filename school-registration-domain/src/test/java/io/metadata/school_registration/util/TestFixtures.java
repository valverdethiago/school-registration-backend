package io.metadata.school_registration.util;

import com.github.javafaker.Faker;
import io.metadata.school_registration.domain.model.Course;
import io.metadata.school_registration.domain.model.Registration;
import io.metadata.school_registration.domain.model.Student;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestFixtures {

  private static final Random RANDOMIZER = new Random();
  private static final Faker faker = new Faker();

  private static final String NAME_PATTERN = "Mastering %s";
  private static final String DESCRIPTION_PATTERN = "Learn how to make the best %s in the world";

  public static Set<Registration> buildFakeRegistrations() {
    return buildFakeRegistrations(RANDOMIZER.nextInt(50)+1);
  }

  public static Set<Registration> buildFakeRegistrations(int size) {
    return IntStream.rangeClosed(0, size)
        .mapToObj(i -> buildRegistration(buildFakeCourse(), buildFakeStudent()))
        .collect(Collectors.toSet());
  }

  public static Set<Course> buildFakeCourses() {
    return buildFakeCourses(RANDOMIZER.nextInt(50)+1);
  }

  public static Set<Course> buildFakeCourses(int size) {
    return IntStream.rangeClosed(0, size)
        .mapToObj(i -> buildFakeCourse())
        .collect(Collectors.toSet());
  }
  public static Set<Student> buildFakeStudents() {
    return buildFakeStudents(RANDOMIZER.nextInt(50)+1);
  }

  public static Set<Student> buildFakeStudents(int size) {
    return IntStream.rangeClosed(0, size)
        .mapToObj(i -> buildFakeStudent())
        .collect(Collectors.toSet());
  }

  public static Course buildFakeCourse() {
    return buildFakeCourse(true);
  }

  public static Course buildFakeCourse(boolean withId) {
    final String dish = faker.food().dish();
    return Course.builder()
        .id(withId ? buildFakeId() : null)
        .name(String.format(NAME_PATTERN, dish))
        .description(String.format(DESCRIPTION_PATTERN, dish))
        .build();
  }

  public static Integer buildFakeId() {
    return RANDOMIZER.nextInt();
  }

  public static Student buildFakeStudent() {
    return buildFakeStudent(true);
  }

  public static Student buildFakeStudent(boolean withId) {
    return Student.builder()
        .id(withId ? buildFakeId() : null)
        .name(faker.name().fullName())
        .build();
  }


  public static Registration buildRegistration(Course course, Student student) {
    return buildRegistration(course, student, true);
  }

  public static Registration buildRegistration(Course course, Student student, boolean withId) {
    return Registration.builder()
        .id(withId ? buildFakeId() : null)
        .student(student)
        .course(course)
        .build();
  }


}
