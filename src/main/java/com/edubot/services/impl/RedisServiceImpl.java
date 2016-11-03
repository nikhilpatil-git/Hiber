package com.edubot.services.impl;

import com.edubot.checkpoint.Session;
import com.edubot.services.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by deadcode on 15/10/2016.
 */
public class RedisServiceImpl implements RedisService {

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public void storeSession(Session session) {

        redisTemplate.opsForHash().put(Session.SessionIdentifier, session.getSessionId(), session);
    }

    @Override
    public Session loadSession(long sessionId) {

        Session session = (Session) redisTemplate.opsForHash().get(Session.SessionIdentifier, sessionId);

        return session;
    }

    @Override
    public boolean doesSessionExist(long senderId) {

        return redisTemplate.opsForHash().hasKey("Session", senderId);
    }
}
