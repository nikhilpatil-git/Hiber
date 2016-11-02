package com.edubot.forms;

import java.io.Serializable;

/**
 * Created by deadcode on 30/10/2016.
 */
public class FacebookSignupForm implements Serializable {

    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private String gender;
    private String collegeName;
    private long facebookId;
    private long botPageId;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public long getFacebookId() {
        return facebookId;
    }

    public long getBotPageId() {
        return botPageId;
    }
}
