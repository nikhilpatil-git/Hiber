package com.edubot.checkpoint;

import java.io.Serializable;

/**
 * Created by deadcode on 15/10/2016.
 */
public class Session implements Serializable {

    private static final long serialVersionUID = -8243145429438016231L;

    private long fbId, pageId;
    private long timestamp;

    public long getPageId() {
        return pageId;
    }

    public void setPageId(long pageId) {
        this.pageId = pageId;
    }

    public long getFbId() {
        return fbId;
    }

    public void setFbId(long fbId) {
        this.fbId = fbId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
