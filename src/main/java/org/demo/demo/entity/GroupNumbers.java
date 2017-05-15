package org.demo.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by cplus on 14.05.2017.
 */
@Entity
public class GroupNumbers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    @ManyToOne
    @JoinColumn(name = "course_numbers_id", nullable = false)
    private CourseNumbers courseNumbers;

    private int groupIndex;

    public GroupNumbers() {
    }

    public GroupNumbers(CourseNumbers courseNumber, int groupIndex) {
        this.courseNumbers = courseNumber;
        this.groupIndex = groupIndex;
    }

    @JsonIgnore
    public CourseNumbers getCourseNumber() {
        return courseNumbers;
    }

    public void setCourseNumber(CourseNumbers courseNumber) {
        this.courseNumbers = courseNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGroupIndex() {
        return groupIndex;
    }

    public void setGroupIndex(int groupIndex) {
        this.groupIndex = groupIndex;
    }

    @Override
    public String toString() {
        return "GroupNumbers{" +
                "id=" + id +
                ", courseNumbers=" + courseNumbers +
                ", groupIndex=" + groupIndex +
                '}';
    }
}
