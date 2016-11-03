package com.edubot.services.impl;

import com.edubot.checkpoint.Session;
import com.edubot.services.JWTService;
import com.edubot.util.Const;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
import java.util.Properties;

/**
 * Created by deadcode on 01/11/2016.
 */
public class JWTServiceImpl implements JWTService {

    @Override
    public SecretKey generateSecretKey() {

        SecretKey secretKey = null;
        FileInputStream file = null;

        try {
            String path = getClass().getClassLoader().getResource("key.properties").getPath();

            file = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(file);

            byte[] decodedKey = Base64.getDecoder().decode(prop.getProperty("key"));

            secretKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } finally {
            try {
                file.close();
            } catch (IOException ex) {
            }
        }

        return secretKey;
    }

    @Override
    public String generateJWTToken(JwtBuilder jwtBuilder) {

        String token = jwtBuilder.setSubject("").compact();

        return token;
    }

    @Override
    public JwtBuilder signWithKey(JwtBuilder jwtBuilder, SecretKey secretKey) {

        return jwtBuilder.signWith(SignatureAlgorithm.HS512, secretKey);
    }

    @Override
    public JwtBuilder embedSecretMessage(JwtBuilder jwtBuilder) {

        return jwtBuilder.setSubject(Const.SecretMessage);
    }

    @Override
    public boolean checkEmbeddedSecretMessage(Claims tokenBody) {

        return tokenBody.getSubject().equals(Const.SecretMessage);
    }

    @Override
    public boolean checkTimeStamp(Claims tokenBody) {
        return true;
    }

    @Override
    public boolean checkSessionId(Claims tokenBody) {
        return true;
    }

    @Override
    public Claims extractTokenBodyFromToken(String token) {

        return Jwts.parser().setSigningKey(generateSecretKey()).parseClaimsJws(token).getBody();
    }

    @Override
    public String extractSessionIdFromTokenBody(Claims tokenBody) {

        return tokenBody.get(Session.SessionIdentifier).toString();
    }

}
