package com.edubot.util;

/**
 * Created by deadcode on 17/10/2016.
 */
public class TypeCoverters {

    public static long ObjectToLongConverter(Object object){

        return ((Long)object).longValue();
    }

    public static int ObjectToIntegerConverter(Object object){

        return ((Integer)object).intValue();
    }

}
