package com.edubot.entities;

import java.io.Serializable;

public class StudentCourseJoin implements Serializable {

    private static final long serialVersionUID = 1L;

    private long studentCourseJoinId;
    private long studentId;
    private long courseId;

    public StudentCourseJoin() {
    }

    public long getStudentCourseJoinId() {
        return studentCourseJoinId;
    }

    public void setStudentCourseJoinId(long studentCourseJoinId) {
        this.studentCourseJoinId = studentCourseJoinId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }
}
