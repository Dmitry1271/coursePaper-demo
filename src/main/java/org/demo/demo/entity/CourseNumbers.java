package org.demo.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.HashSet;
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

    @OneToMany(mappedBy = "courseNumbers", cascade = CascadeType.ALL)
    private Set<GroupNumbers> groupNumbersSet = new HashSet<>();


    public CourseNumbers() {
    }

    public CourseNumbers(int courseIndex) {
        this.courseIndex = courseIndex;
    }

    public Set<GroupNumbers> getGroupNumbersSet() {
        return groupNumbersSet;
    }

    public void setGroupNumbersSet(Set<GroupNumbers> groupNumbersSet) {
        this.groupNumbersSet = groupNumbersSet;
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

}
