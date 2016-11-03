package com.edubot.facades.impl;

import com.edubot.checkpoint.Session;
import com.edubot.facades.JWTFacade;
import com.edubot.facades.RedisFacade;
import com.edubot.facades.SecurityFacade;
import com.edubot.services.impl.SecurityService;
import com.edubot.util.Const;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

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
    public void authenticateTokenAddAttribute(String token, HttpServletRequest httpServletRequest) {

        Const.SessionStatus sessionStatus = jwtFacade.authenticateToken(token);

        httpServletRequest.setAttribute("SessionStatus", sessionStatus.name());

        if(sessionStatus == Const.SessionStatus.VALID){

            String sessionId = jwtFacade.extractSessionIdFromToken(token);

            httpServletRequest.setAttribute("SessionId", sessionId);
        }

    }

    @Override
    public Session generateSessionFromSessionId(long sessionId) {

        return redisFacade.loadUserSession(sessionId);
    }
}
