package com.edubot.forms;

import java.io.Serializable;

/**
 * Created by deadcode on 30/10/2016.
 */
public class InstituteDetailForm implements Serializable {

    private static final long serialVersionUID = 1L;

    private String collegeName;
    private String email;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
