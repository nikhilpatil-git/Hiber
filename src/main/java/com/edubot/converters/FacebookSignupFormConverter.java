package com.edubot.converters;

import com.edubot.checkpoint.Session;
import com.edubot.entities.person.Teacher;
import com.edubot.forms.FacebookSignupForm;

/**
 * Created by deadcode on 30/10/2016.
 */
public class FacebookSignupFormConverter {

    public static Teacher convertToTeacher(FacebookSignupForm facebookSignupForm){

        Teacher teacher = new Teacher();
        teacher.setFirstName(facebookSignupForm.getFirstName());
        teacher.setLastName(facebookSignupForm.getLastName());
        teacher.setGender(facebookSignupForm.getGender());
        teacher.setCollegeName(facebookSignupForm.getCollegeName());

        return teacher;
    }

    public static Session convertToSession(FacebookSignupForm facebookSignupForm){

        Session session = new Session();
        session.setFirstName(facebookSignupForm.getFirstName());
        session.setTimestamp(System.currentTimeMillis());
        session.setFbId(facebookSignupForm.getFacebookId());
        session.setPageId(facebookSignupForm.getBotPageId());

        return session;
    }

}
