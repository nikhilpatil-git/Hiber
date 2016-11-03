package com.edubot.converters;

import com.edubot.checkpoint.Session;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;

/**
 * Created by deadcode on 01/11/2016.
 */
public class RandomConverters {

    public static JwtBuilder SessionToJWTBuilderConverter(Session session){

        JwtBuilder builder =  Jwts.builder();
        builder.claim(Session.SessionIdentifier, session.getSessionId());
        builder.claim("timestamp", session.getTimestamp());

        return builder;
    }
}
