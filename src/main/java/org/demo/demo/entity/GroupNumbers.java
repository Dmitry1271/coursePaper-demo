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
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private CourseNumbers courseNumber;

    private int groupIndex;

    public GroupNumbers() {
    }

    public GroupNumbers(CourseNumbers courseNumber, int groupIndex) {
        this.courseNumber = courseNumber;
        this.groupIndex = groupIndex;
    }

    public CourseNumbers getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(CourseNumbers courseNumber) {
        this.courseNumber = courseNumber;
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
                "courseNumber=" + courseNumber +
                ", id=" + id +
                ", groupIndex=" + groupIndex +
                '}';
    }
}
