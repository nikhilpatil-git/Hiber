package com.edubot.facades;

import com.edubot.checkpoint.Session;

/**
 * Created by deadcode on 01/11/2016.
 */
public interface SecurityFacade {

    public String generateTokenFromSession(Session session);

    public String authenticateTokenReturnSessionId(String token);

}
