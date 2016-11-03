package com.edubot.facades.impl;

import com.edubot.checkpoint.Session;
import com.edubot.facades.RedisFacade;
import com.edubot.services.RedisService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by deadcode on 15/10/2016.
 */
public class RedisFacadeImpl implements RedisFacade {

    @Autowired
    RedisService redisService;

    @Override
    public boolean isUserAuthentic(long facebookId) {
        return false;
    }

    @Override
    public Session loadUserSession(long facebookId) {

        return redisService.loadSession(facebookId);
    }

    @Override
    public void storeSession(Session session) {

        redisService.storeSession(session);
    }
}
