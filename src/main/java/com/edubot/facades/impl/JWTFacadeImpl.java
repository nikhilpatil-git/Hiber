package com.edubot.facades.impl;

import com.edubot.checkpoint.Session;
import com.edubot.converters.RandomConverters;
import com.edubot.facades.JWTFacade;
import com.edubot.services.JWTService;
import io.jsonwebtoken.JwtBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import javax.crypto.SecretKey;

/**
 * Created by deadcode on 01/11/2016.
 */
public class JWTFacadeImpl implements JWTFacade {

    @Autowired
    JWTService jwtService;

    @Override
    public String generateTokenFromSession(Session session) {

        SecretKey secretKey = jwtService.generateSecretKey();

        JwtBuilder jwtBuilder = RandomConverters.SessionToJWTBuilderConverter(session);

        jwtBuilder = jwtService.signWithKey(jwtBuilder, secretKey);

        return jwtService.generateJWTToken(jwtBuilder);
    }
}
