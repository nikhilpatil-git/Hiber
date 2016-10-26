package com.edubot.entities;

import java.io.Serializable;

/**
 * Created by deadcode on 26/10/2016.
 */
public abstract class AbstractQuestion implements Serializable{

    private static final long serialVersionUID = 1L;
    private long abstractQuestionId;
    private String text;
    private String hint;
    private int rightAnswer;
    private int sequence;


    public long getAbstractQuestionId() {
        return abstractQuestionId;
    }

    public void setAbstractQuestionId(long abstractQuestionId) {
        this.abstractQuestionId = abstractQuestionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(int rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
}
