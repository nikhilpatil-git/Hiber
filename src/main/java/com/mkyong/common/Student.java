package com.mkyong.common;

/**
 * Created by deadcode on 23/10/2016.
 */
public class Student extends Member {

    long facebookId;
    long pageId;

    public Student() {
    }

    public long getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(long facebookId) {
        this.facebookId = facebookId;
    }

    public long getPageId() {
        return pageId;
    }

    public void setPageId(long pageId) {
        this.pageId = pageId;
    }
}
