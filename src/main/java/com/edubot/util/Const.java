package com.edubot.util;

import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

public class Const {

    public static long PageId = 1L;

    public static enum QuestionType{
        MCQ, TF
    }

    public static ApplicationContext applicationContext;

    public static final String EDUBOT_EMAIL_ADDRESS = "patilnikhil9@gmail.com";

    public static final ArrayList<String> AllowedUris = new ArrayList<>();

    public static final ArrayList<String> AllowedHeaders = new ArrayList<>();

    static {
        AllowedUris.add("/teacher/signup");
        AllowedUris.add("/teacher/signin");
        AllowedUris.add("/teacher/confirm");

        AllowedHeaders.add("Location");
        AllowedHeaders.add("Authorization");
    }

    public static enum StoryLineTypes {

         MESSAGE, QUESTION, QUICK_REPLY
    }


    public class ClientUris{

        private static final String CLIENT_BASE = "http://localhost:8001/#!";
        public static final String CLIENT_WELCOME = CLIENT_BASE+"/welcome";
        public static final String CLIENT_SERVICE_DOWN = CLIENT_BASE+"/service_down";
        public static final String CLIENT_HOME = CLIENT_BASE+"/home";
        public static final String CLIENT_SIGN_UP = CLIENT_BASE+"/signup";
        public static final String CLIENT_CLASS = CLIENT_BASE+"/class";
        public static final String CLIENT_ASSIGNMENT = CLIENT_BASE+"/assignment";
    }

    public class NoSecurityURIs {

        public static final String TEACHER_CREATE = "/teacher/signup";
        public static final String TEACHER_CONFIRM = "/teacher/confirm";
    }

}
