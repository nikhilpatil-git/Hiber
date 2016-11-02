package com.edubot.facades.impl;

import com.edubot.checkpoint.Session;
import com.edubot.converters.FacebookSignupFormConverter;
import com.edubot.facades.JWTFacade;
import com.edubot.facades.RedisFacade;
import com.edubot.facades.SecurityFacade;
import com.edubot.forms.FacebookSignupForm;
import com.edubot.services.impl.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by deadcode on 01/11/2016.
 */
public class SecurityFacadeImpl implements SecurityFacade {

    @Autowired
    SecurityService securityService;

    @Autowired
    RedisFacade redisFacade;

    @Autowired
    JWTFacade jwtFacade;


    @Override
    public String createSessionReturnToken(FacebookSignupForm facebookSignupForm) {

        /**
         * Convert FacebookSignupForm object to Session object.
         */
        Session session = FacebookSignupFormConverter.convertToSession(facebookSignupForm);


        System.out.println("Session is created "+session.getFbId());

        /**
         * Store session in the in-memory redis database.
         */
        redisFacade.storeSession(session);

        /**
         * Generate and return token holding the session details.
         */

        return jwtFacade.generateTokenFromSession(session);
    }

}
