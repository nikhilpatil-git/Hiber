/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edubot.handlers;

import com.edubot.checkpoint.Session;
import com.edubot.util.Const;

/**
 *
 * @author deadcode
 */


public class SecurityHandler {

    private static final String secret = "EDU-BOT";

    public Session createSession(long facebookId){

        Session session = new Session();
        session.setTimestamp(System.currentTimeMillis());
        session.setFbId(facebookId);
        session.setPageId(Const.PageId);

        return session;
    }

}

// Generate a secret key
// SecretKey secretKey = KeyGenerator.getInstance("AES").generateKey();