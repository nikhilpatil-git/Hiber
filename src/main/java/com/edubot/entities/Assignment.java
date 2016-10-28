package com.edubot.entities;

import com.edubot.entities.question.AbstractQuestion;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Assignment implements Serializable {

    private static final long serialVersionUID = 1L;
    private long assignmentId;
    private String title;
    private String description;
    private Date startDate, endDate;
    private int numberOfDays;
    private int marksPerQuestion;
    private Course course;
    private Set<AbstractQuestion> questions = new HashSet<>(0);

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


    public int getMarksPerQuestion() {
        return marksPerQuestion;
    }

    public void setAssignmentId(long assignmentId) {
        this.assignmentId = assignmentId;
    }

    public long getAssignmentId() {
        return assignmentId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setMarksPerQuestion(int marksPerQuestion) {
        this.marksPerQuestion = marksPerQuestion;
    }

    public Set<AbstractQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<AbstractQuestion> questions) {
        this.questions = questions;
    }
}
