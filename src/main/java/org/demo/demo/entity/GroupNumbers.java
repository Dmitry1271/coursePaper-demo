package org.demo.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by cplus on 14.05.2017.
 */
@Entity
public class GroupNumbers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonIgnore
    @OneToMany(mappedBy = "groupNumbers", cascade = CascadeType.ALL)
    private Set<Pair> pairSet = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "course_numbers_id", nullable = false)
    private CourseNumbers courseNumbersForCourse;

    private int groupIndex;

    public GroupNumbers() {
    }

    public GroupNumbers(Set<Pair> pairSet, CourseNumbers courseNumbersForCourse, int groupIndex) {
        this.pairSet = pairSet;
        this.courseNumbersForCourse = courseNumbersForCourse;
        this.groupIndex = groupIndex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Pair> getPairSet() {
        return pairSet;
    }

    public void setPairSet(Set<Pair> pairSet) {
        this.pairSet = pairSet;
    }

    @JsonIgnore
    public CourseNumbers getCourseNumbersForCourse() {
        return courseNumbersForCourse;
    }

    public void setCourseNumbersForCourse(CourseNumbers courseNumbersForCourse) {
        this.courseNumbersForCourse = courseNumbersForCourse;
    }

    public int getGroupIndex() {
        return groupIndex;
    }

    public void setGroupIndex(int groupIndex) {
        this.groupIndex = groupIndex;
    }
}
