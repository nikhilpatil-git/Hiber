package com.mkyong.common;

/**
 * Created by deadcode on 23/10/2016.
 */
public class Member implements java.io.Serializable {

    private long memberId;
    private String userName;
    private String email;
    private String collegeName;
    private boolean emailVerify;

    public Member() {
    }


    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public boolean isEmailVerify() {
        return emailVerify;
    }

    public void setEmailVerify(boolean emailVerify) {
        this.emailVerify = emailVerify;
    }

}
