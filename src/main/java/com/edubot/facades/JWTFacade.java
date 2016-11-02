package com.edubot.facades;

import com.edubot.checkpoint.Session;

/**
 * Created by deadcode on 01/11/2016.
 */
public interface JWTFacade {

    public String generateTokenFromSession(Session session);
}
