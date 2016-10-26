package com.edubot;

import com.edubot.test_methods.SaveTest;
import com.edubot.util.HibernateUtil;
import org.hibernate.Session;

public class App 
{
    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();

        SaveTest saveTest = new SaveTest(session);
    }
}
