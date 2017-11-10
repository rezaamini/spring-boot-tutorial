package io.javabrains.springbootstarter.course;

import io.javabrains.springbootstarter.topic.Topic;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Course {

    @Id
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String description;
    @ManyToOne // many courses are mapped to one topic
    @Getter
    @Setter
    private Topic topic;

    public Course() {

    }

    public Course(String id, String name, String description, String topicId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
    }

}
