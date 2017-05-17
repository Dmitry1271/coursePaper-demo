package org.demo.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Pair {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    @ManyToOne
    @JoinColumn(name = "course_id",nullable = false, insertable=false, updatable=false)
    @JsonIgnore
    private GroupNumbers courseNumbersForPair;

    @ManyToOne
    @JoinColumn(name = "group_id",nullable = false, insertable=false, updatable=false)
    @JsonIgnore
    private GroupNumbers groupNumbers;

    private String name;

    @JsonIgnore
    @Column(name = "course_id")
    private int courseId;

    @JsonIgnore
    @Column(name = "group_id")
    private int groupId;

    @Column(nullable = true)
    private String teacher;

    private int number;

    @Column(nullable = true)
    private String classroom;

    private int day;

    private boolean lecture;

    @JsonIgnore
    private int evenDay;

    public Pair() {
    }

    public Pair(GroupNumbers courseNumbersForPair, GroupNumbers groupNumbers, String name, int courseId, int groupId, String teacher, int number, String classroom, int day, boolean lecture, int evenDay) {
        this.courseNumbersForPair = courseNumbersForPair;
        this.groupNumbers = groupNumbers;
        this.name = name;
        this.courseId = courseId;
        this.groupId = groupId;
        this.teacher = teacher;
        this.number = number;
        this.classroom = classroom;
        this.day = day;
        this.lecture = lecture;
        this.evenDay = evenDay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GroupNumbers getCourseNumbersForPair() {
        return courseNumbersForPair;
    }

    public void setCourseNumbersForPair(GroupNumbers courseNumbersForPair) {
        this.courseNumbersForPair = courseNumbersForPair;
    }

    public GroupNumbers getGroupNumbers() {
        return groupNumbers;
    }

    public void setGroupNumbers(GroupNumbers groupNumbers) {
        this.groupNumbers = groupNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isLecture() {
        return lecture;
    }

    public void setLecture(boolean lecture) {
        this.lecture = lecture;
    }

    public int getEvenDay() {
        return evenDay;
    }

    public void setEvenDay(int evenDay) {
        this.evenDay = evenDay;
    }
}
