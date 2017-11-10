package io.javabrains.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    // You should name the method appropriately. JPA implements it automatically based on the method name.
    // Method naming convention: findByX where X is the property name.
    // Examples
    List<Course> findByName(String name);
    List<Course> findByDescription(String description);

    // When argument is property of a class, you can add class property name to method name (e.g., id property of topic)
    List<Course> findByTopicId(String topicId);

}
