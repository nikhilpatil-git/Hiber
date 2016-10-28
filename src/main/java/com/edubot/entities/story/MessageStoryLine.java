package com.edubot.entities.story;

/**
 * Created by deadcode on 28/10/2016.
 */
public class MessageStoryLine extends AbstractStoryLine {

    private long storyLineId;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
