package com.mkyong.common;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by deadcode on 23/10/2016.
 */
public class Teacher implements Serializable {

    private long teacherId;
    private String teacherName;
    private String email;
    private String collegeName;
    private boolean emailVerify;
    private Set<Course> courses = new HashSet<>(0);

    public Teacher() {
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public long getTeacherId() {
        return teacherId;
    }

    public boolean isEmailVerify() {
        return emailVerify;
    }

    public void setEmailVerify(boolean emailVerify) {
        this.emailVerify = emailVerify;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
