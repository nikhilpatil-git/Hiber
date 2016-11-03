package com.edubot.services;

import com.edubot.checkpoint.Session;

/**
 * Created by deadcode on 15/10/2016.
 */
public interface RedisService {

    public void storeSession(Session session);

    public Session loadSession(long senderId);

    public boolean doesSessionExist(long senderId);
}
