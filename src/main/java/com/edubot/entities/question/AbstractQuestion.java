package com.edubot.entities.question;

import com.edubot.entities.Assignment;

import java.io.Serializable;

/**
 * Created by deadcode on 26/10/2016.
 */
public abstract class AbstractQuestion implements Serializable{

    private static final long serialVersionUID = 1L;
    private long questionId;
    private String text;
    private String hint;
    private int rightAnswer;
    private int sequence;
    private Assignment assignment;
/*    private QuestionStoryLine questionStoryLine;

    public QuestionStoryLine getQuestionStoryLine() {
        return questionStoryLine;
    }

    public void setQuestionStoryLine(QuestionStoryLine questionStoryLine) {
        this.questionStoryLine = questionStoryLine;
    }*/

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
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

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}
