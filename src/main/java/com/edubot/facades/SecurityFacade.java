package com.edubot.facades;

import com.edubot.forms.FacebookSignupForm;

/**
 * Created by deadcode on 01/11/2016.
 */
public interface SecurityFacade {

    public String createSessionReturnToken(FacebookSignupForm facebookSignupForm);

}
