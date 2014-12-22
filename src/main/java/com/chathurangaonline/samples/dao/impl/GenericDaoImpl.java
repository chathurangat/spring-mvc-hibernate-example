package com.chathurangaonline.samples.dao.impl;

import com.chathurangaonline.samples.dao.GenericDao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by chathuranga on 12/22/14.
 */
public class GenericDaoImpl<T> implements GenericDao<T> {

    SessionFactory sessionFactory;

    @Override
    public T save(T t) {
        Transaction tx = null;
        try{
            Session session = this.getSession();
            tx = session.getTransaction();
            tx.begin();
            session.save(t);
            tx.commit();
        }
        catch (HibernateException ex){
            //todo error handling with logging
            if(tx!=null){
                tx.rollback();
            }
        }

        return null;
    }


    @Override
    public void update(T t) {

    }

    @Override
    public void delete(T t) {

    }

    @Override
    public T findById(Serializable id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession(){
        if(sessionFactory!=null){
            return sessionFactory.getCurrentSession();
        }
        throw new HibernateException("session_factory_is_not_initialized_properly");
    }
}
