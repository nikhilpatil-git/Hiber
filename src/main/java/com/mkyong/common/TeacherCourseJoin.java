package com.mkyong.common;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by deadcode on 23/10/2016.
 */
public class TeacherCourseJoin {

    private long teacherCourseJoinId;
    private Set<Course> courses = new HashSet<>(0);

    public long getTeacherCourseJoinId() {
        return teacherCourseJoinId;
    }

    public void setTeacherCourseJoinId(long teacherCourseJoinId) {
        this.teacherCourseJoinId = teacherCourseJoinId;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
