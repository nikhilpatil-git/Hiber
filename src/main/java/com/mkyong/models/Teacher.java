package com.mkyong.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by deadcode on 23/10/2016.
 */
public class Teacher extends Person implements Serializable {

    private long teacherId;
    private Set<Course> courses = new HashSet<>(0);
    private String alias;

    public Teacher() {
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
