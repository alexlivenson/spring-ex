package com.springapp.mvc.dao;

/**
 * Created by alexlivenson on 1/20/15.
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAO {
        @Autowired
        private SessionFactory sessionFactory;

        protected Session getSession() {
            return sessionFactory.getCurrentSession();
        }

        public void persist(Object entity) {
            getSession().persist(entity);
        }

        public void delete(Object entity) {
            getSession().delete(entity);
        }

}
