package org.demo.demo.entity;

import javax.persistence.*;

@Entity
public class Pair {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String pairName;
    private String teacherName;
    private int studentCourse;
    private int studentGroup;
    private int weekdayIndex;


    public Pair() {
    }

    public Pair(String pairName, String teacherName, int studentCourse, int studentGroup, int weekdayIndex) {
        this.pairName = pairName;
        this.teacherName = teacherName;
        this.studentCourse = studentCourse;
        this.studentGroup = studentGroup;
        this.weekdayIndex = weekdayIndex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPairName() {
        return pairName;
    }

    public void setPairName(String pairName) {
        this.pairName = pairName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
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

    public int getWeekdayIndex() {
        return weekdayIndex;
    }

    public void setWeekdayIndex(int weekdayIndex) {
        this.weekdayIndex = weekdayIndex;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "id=" + id +
                ", pairName='" + pairName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", studentCourse=" + studentCourse +
                ", studentGroup=" + studentGroup +
                ", weekdayIndex=" + weekdayIndex +
                '}';
    }
}
