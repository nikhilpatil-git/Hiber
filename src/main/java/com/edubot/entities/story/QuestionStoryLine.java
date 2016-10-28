package com.edubot.entities.story;

import com.edubot.entities.question.AbstractQuestion;

/**
 * Created by deadcode on 28/10/2016.
 */
public class QuestionStoryLine extends AbstractStoryLine {

    private long storyLineId;
    private AbstractQuestion question;

    public AbstractQuestion getQuestion() {
        return question;
    }

    public void setQuestion(AbstractQuestion question) {
        this.question = question;
    }

    @Override
    public long getStoryLineId() {
        return storyLineId;
    }

    @Override
    public void setStoryLineId(long storyLineId) {
        this.storyLineId = storyLineId;
    }
}
