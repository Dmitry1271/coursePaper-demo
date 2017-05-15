package org.demo.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by cplus on 14.05.2017.
 */
@Entity
public class CourseNumbers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    private int courseIndex;

    private String groupNumbers;

    public CourseNumbers() {
    }

    public CourseNumbers(int courseIndex, String groupNumbers) {
        this.courseIndex = courseIndex;
        this.groupNumbers = groupNumbers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCourseIndex() {
        return courseIndex;
    }

    public void setCourseIndex(int courseIndex) {
        this.courseIndex = courseIndex;
    }

    public String getGroupNumbers() {
        return groupNumbers;
    }

    public void setGroupNumbers(String groupNumbers) {
        this.groupNumbers = groupNumbers;
    }

    @Override
    public String toString() {
        return "\"CourseNumbers\":{" +
                "id=" + id +
                ", courseIndex=" + courseIndex +
                ", groupNmbers=" + groupNumbers +
                '}';
    }
}
