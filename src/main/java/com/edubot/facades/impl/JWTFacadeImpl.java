package com.edubot.facades.impl;

import com.edubot.checkpoint.Session;
import com.edubot.converters.RandomConverters;
import com.edubot.facades.JWTFacade;
import com.edubot.services.JWTService;
import com.edubot.util.Const;
import io.jsonwebtoken.Claims;
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
    public String generateAuthTokenFromSession(Session session) {


        /*
         * Create JWT builder from the session
        */

        JwtBuilder jwtBuilder = RandomConverters.SessionToJWTBuilderConverter(session);

        /*
         * Generate secret key for signing the authentication token
        */
        SecretKey secretKey = jwtService.generateSecretKey();

        jwtBuilder = jwtService.embedSecretMessage(jwtBuilder);

        /*
         * Sign the token with the secret key
        */
        return jwtService.signWithKey(jwtBuilder, secretKey).compact();
    }

    @Override
    public Const.SessionStatus authenticateToken(String token) {

        /*
         * Extract token body from token
        */

        Claims tokenBody = jwtService.extractTokenBodyFromToken(token);

        /*
        * Check - 1 check embedded secret message
        */

        boolean messageStatus = jwtService.checkEmbeddedSecretMessage(tokenBody);

        if(!messageStatus){
            return Const.SessionStatus.INVALID;
        }

        /*
        * Check - 2 check timestamp
        */

        boolean timestampStatus = jwtService.checkTimeStamp(tokenBody);

        if(!timestampStatus){
            return Const.SessionStatus.EXPIRED;
        }

        /*
        * Check - 3 check session id
        */

        boolean sessionIdStatus = jwtService.checkSessionId(tokenBody);


        if(!sessionIdStatus){
            return Const.SessionStatus.INVALID;
        }


        return Const.SessionStatus.VALID;
    }

    @Override
    public String extractSessionIdFromToken(String token) {

        /*
         * Extract token body from token.
        */

        Claims tokenBody = jwtService.extractTokenBodyFromToken(token);

        /*
         * Extract and return session id from token body.
        */

        return jwtService.extractSessionIdFromTokenBody(tokenBody);
    }
}
