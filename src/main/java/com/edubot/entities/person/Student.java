package com.edubot.entities.person;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student extends Person implements Serializable{

    private static final long serialVersionUID = 1L;
    private long studentId;

    public Student() {
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

}
