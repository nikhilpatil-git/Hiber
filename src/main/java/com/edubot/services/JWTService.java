package com.edubot.services;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;

import javax.crypto.SecretKey;

/**
 * Created by deadcode on 01/11/2016.
 */
public interface JWTService {

    public SecretKey generateSecretKey();

    public String generateJWTToken(JwtBuilder jwtBuilder);

    public JwtBuilder signWithKey(JwtBuilder jwtBuilder, SecretKey secretKey);

    public JwtBuilder embedSecretMessage(JwtBuilder jwtBuilder);

    public boolean checkEmbeddedSecretMessage(Claims tokenBody);

    public boolean checkTimeStamp(Claims tokenBody);

    public boolean checkSessionId(Claims tokenBody);

    public Claims extractTokenBodyFromToken(String token);

    public String extractSessionIdFromTokenBody(Claims tokenBody);
}
