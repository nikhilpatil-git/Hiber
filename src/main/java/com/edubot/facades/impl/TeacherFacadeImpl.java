package com.edubot.facades.impl;

import com.edubot.checkpoint.Session;
import com.edubot.converters.FacebookSignupFormConverter;
import com.edubot.entities.person.Teacher;
import com.edubot.facades.SecurityFacade;
import com.edubot.facades.TeacherFacade;
import com.edubot.forms.FacebookSignupForm;
import com.edubot.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by deadcode on 30/10/2016.
 */
public class TeacherFacadeImpl implements TeacherFacade {

    @Autowired
    TeacherService teacherService;

    @Autowired
    SecurityFacade securityFacade;

    @Override
    public String registerPersonReturnToken(FacebookSignupForm facebookSignupForm) {

        /*
         * Convert FacebookSignupForm to teacher and store in the database
        */

        Teacher teacher = FacebookSignupFormConverter.convertToTeacher(facebookSignupForm);

        teacherService.insertTeacher(teacher);

        /*
         * Convert FacebookSignupForm to Session
        */

        Session session = FacebookSignupFormConverter.convertToSession(facebookSignupForm);

        /*
         * Generate and return the Auth-Token from the created session
        */

        return securityFacade.generateTokenFromSession(session);
    }

    @Override
    public void registerFacebookDetails(FacebookSignupForm facebookSignupForm) {

        Teacher teacher = FacebookSignupFormConverter.convertToTeacher(facebookSignupForm);

        teacherService.insertTeacher(teacher);
    }

    @Override
    public void registerEmail(Session session, String email) {

        teacherService.insertEmail(email, session.getFbId());
        System.out.println(email);
    }
}
