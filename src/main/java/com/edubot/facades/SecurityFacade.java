package com.edubot.facades;

import com.edubot.checkpoint.Session;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by deadcode on 01/11/2016.
 */
public interface SecurityFacade {

    public String generateTokenFromSession(Session session);

    public void authenticateTokenAddAttribute(String token, HttpServletRequest httpServletRequest);

}
