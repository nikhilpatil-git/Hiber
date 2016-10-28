package com.edubot.entities.question;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrueFalseQuestion extends AbstractQuestion implements Serializable{

    private static final long serialVersionUID = 1L;
    private long questionId;

    public TrueFalseQuestion() {
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }
}
