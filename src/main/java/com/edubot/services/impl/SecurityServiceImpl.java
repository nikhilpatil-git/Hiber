package com.edubot.services.impl;

import io.jsonwebtoken.JwtBuilder;

/**
 * Created by deadcode on 01/11/2016.
 */
public class SecurityServiceImpl implements SecurityService {

    @Override
    public String generateToken(JwtBuilder jwtBuilder) {

        return jwtBuilder.compact();
    }
}
