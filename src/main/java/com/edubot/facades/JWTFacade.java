package com.edubot.facades;

import com.edubot.checkpoint.Session;
import com.edubot.util.Const;

/**
 * Created by deadcode on 01/11/2016.
 */
public interface JWTFacade {

    public String generateAuthTokenFromSession(Session session);

    public Const.SessionStatus authenticateToken(String token);

    public String extractSessionIdFromToken(String token);
}
