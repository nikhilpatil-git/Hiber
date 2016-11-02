package com.edubot.facades.impl;

import com.edubot.checkpoint.Session;
import com.edubot.facades.JWTFacade;
import com.edubot.facades.RedisFacade;
import com.edubot.facades.SecurityFacade;
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
    public String generateTokenFromSession(Session session) {

        /*
         * Store session in the in-memory redis database.
        */
        redisFacade.storeSession(session);

        /*
         * Generate and return token from session.
        */

        return jwtFacade.generateAuthTokenFromSession(session);
    }

    @Override
    public String authenticateTokenReturnSessionId(String token) {


        return null;
    }
}
