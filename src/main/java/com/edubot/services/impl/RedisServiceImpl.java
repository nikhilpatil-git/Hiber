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
    public boolean storeSession(Session session) {

        redisTemplate.opsForHash().put("Session", session.getFbId(), session);

        return (loadSession(session.getFbId())) != null ? true : false;
    }

    @Override
    public Session loadSession(long senderId) {

        Session session = (Session) redisTemplate.opsForHash().get("Session", senderId);

        return session;
    }

    @Override
    public boolean doesSessionExist(long senderId) {

        return redisTemplate.opsForHash().hasKey("Session", senderId);
    }
}
