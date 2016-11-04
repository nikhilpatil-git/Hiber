package com.edubot.facades;

import com.edubot.checkpoint.Session;
import com.edubot.forms.FacebookSignupForm;
import com.edubot.forms.InstituteDetailForm;

/**
 * Created by deadcode on 30/10/2016.
 */
public interface TeacherFacade {

    public String registerPersonReturnToken(FacebookSignupForm facebookSignupForm);
    public void registerFacebookDetails(FacebookSignupForm facebookSignupForm);
    public void registerInstituteDetail(Session session, InstituteDetailForm instituteDetailForm);
}
