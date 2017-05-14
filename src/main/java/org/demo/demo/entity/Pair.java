package org.demo.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Pair {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    private String name;

    private String teacher;

    private int number;

    private int classroom;

    @JsonIgnore
    private int studentCourse;

    @JsonIgnore
    private int studentGroup;

    private int day;


    public Pair() {
    }

    public Pair(String name, String teacher, int number, int classroom, int studentCourse, int studentGroup, int day) {
        this.name = name;
        this.teacher = teacher;
        this.number = number;
        this.classroom = classroom;
        this.studentCourse = studentCourse;
        this.studentGroup = studentGroup;
        this.day = day;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public int getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(int studentCourse) {
        this.studentCourse = studentCourse;
    }

    public int getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(int studentGroup) {
        this.studentGroup = studentGroup;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", number=" + number +
                ", classroom=" + classroom +
                ", studentCourse=" + studentCourse +
                ", studentGroup=" + studentGroup +
                ", day=" + day +
                '}';
    }
}
