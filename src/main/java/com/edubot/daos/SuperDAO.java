package com.edubot.daos;

import org.apache.log4j.Logger;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by deadcode on 28/10/2016.
 */

public abstract class SuperDAO {

    @Autowired
    SessionFactory sessionFactory;

    private Session session;
    private Transaction transaction;

    protected
    final Logger logger = Logger.getLogger(SuperDAO.class);

    public void save(Object object){

        beginTransaction();

        session.save(object);

        commitTransaction();

    }

    public void updateSingletonEntity(String queryText){

        beginTransaction();

        try {

            int result = getSession().createQuery(queryText).executeUpdate();

            logger.debug("Entity update status:- "+result);

        }catch (QueryException qx){

            logger.debug("QueryException :- "+qx.getMessage());

        }

        commitTransaction();

    }

    public Object getSingletonEntity(String queryText){

        openSession();

        Object object = null;

        try {

            object = getSession().createQuery(queryText).getSingleResult();

        }catch (QueryException qx){

            logger.debug("QueryException :- "+qx.getMessage());

        }

        closeSession();

        return object;
    }

    public void openSession(){

        try {

            setSession(getSessionFactory().openSession());

        }catch (HibernateException hx){

            System.out.println("Something happened "+hx);

        }
    }

    public void closeSession(){

        try {

            getSession().close();

        }catch (HibernateException hx){
            System.out.println("Something happened "+hx);
        }
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    private void beginTransaction(){

        // Open Session
        openSession();

        // begin transaction
        setTransaction(getSession().beginTransaction());
    }

    private void commitTransaction(){

        // Commit transaction
        getTransaction().commit();

        // Close session
        closeSession();
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
