package com.edubot.util;

import java.util.ArrayList;

/**
 * Created by deadcode on 01/11/2016.
 */
public class AllowedUrls {

    public static final ArrayList<String> urls = new ArrayList<>();

    static {
        urls.add("/teacher/signup1");
        urls.add("/teacher/signup2");
    }

    public static boolean check(String url){

         return urls.contains(url);
    }

}
