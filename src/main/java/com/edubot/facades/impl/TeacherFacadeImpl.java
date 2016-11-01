package com.edubot.facades.impl;

import com.edubot.converters.FacebookSignupFormConverter;
import com.edubot.entities.person.Teacher;
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

    @Override
    public void registerFacebookDetails(FacebookSignupForm facebookSignupForm) {

        Teacher teacher = FacebookSignupFormConverter.convertToTeacher(facebookSignupForm);

        teacherService.insertTeacher(teacher);
    }

    @Override
    public void registerEmail(String email) {

        System.out.println(email);
    }
}
