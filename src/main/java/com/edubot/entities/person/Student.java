package com.edubot.entities.person;

import com.edubot.entities.person.Person;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student extends Person implements Serializable{

    private static final long serialVersionUID = 1L;
    private long studentId;
    private long facebookId;
    private long pageId;
    //private Set<Course> courses = new HashSet<>(0);


    public Student() {
    }

    public long getPageId() {
        return pageId;
    }

    public void setPageId(long pageId) {
        this.pageId = pageId;
    }

    public long getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(long facebookId) {
        this.facebookId = facebookId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

}