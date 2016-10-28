package com.edubot.entities.story;

/**
 * Created by deadcode on 23/10/2016.
 */
public abstract class AbstractStoryLine implements java.io.Serializable {


    private long storyLineId;
    private int sequence;

    public AbstractStoryLine() {
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public long getStoryLineId() {
        return storyLineId;
    }

    public void setStoryLineId(long storyLineId) {
        this.storyLineId = storyLineId;
    }
}
