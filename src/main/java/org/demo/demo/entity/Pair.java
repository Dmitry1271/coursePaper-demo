package org.demo.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pair {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private int course;

    private int group;

    private String pairName;

    private String teacherName;

    private int weekdayIndex;

    public Pair() {
    }

    public Pair(int course, int group, String pairName, String teacherName, int weekdayIndex) {
        this.course = course;
        this.group = group;
        this.pairName = pairName;
        this.teacherName = teacherName;
        this.weekdayIndex = weekdayIndex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
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
                ", course=" + course +
                ", group=" + group +
                ", pairName='" + pairName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", weekdayIndex=" + weekdayIndex +
                '}';
    }
}
