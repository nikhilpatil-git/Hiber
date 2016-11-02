package com.edubot.services.impl;

import com.edubot.checkpoint.Session;

/**
 * Created by deadcode on 01/11/2016.
 */
public interface SecurityService {

    public String generateTokenFromSession(Session session);
}
