package com.edubot.facades;

import com.edubot.forms.FacebookSignupForm;

/**
 * Created by deadcode on 30/10/2016.
 */
public interface TeacherFacade {

    public void registerFacebookDetails(FacebookSignupForm facebookSignupForm);
    public void registerEmail(String email);
}
