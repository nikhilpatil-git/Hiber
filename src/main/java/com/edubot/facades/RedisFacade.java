package com.edubot.facades;


import com.edubot.checkpoint.Session;

/**
 * Created by deadcode on 15/10/2016.
 */
public interface RedisFacade {

    /**
     * This function will check both in the Redis & PostGre database for the user with the
     * provided facebookId.
     *
     * @param facebookId
     * @return true/false based on the user existence status in the backend.
     */
    public boolean isUserAuthentic(long facebookId);

    /**
     * This function will load the active session corresponding to the provided user's facebookId
     *
     * @param facebookId
     * @return
     */

    public Session loadUserSession(long facebookId);

    /**
     * This function w'll be called if the user is authentic but no active session can be
     * found in the Redis.
     *
     *
     * @param session
     */
    public void storeSession(Session session);
}
