package com.platzi.hibernateProject.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PlatziSession {

	public Session getSession() {
		SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        
        sessionFactory = configuration.buildSessionFactory();
        Session session= sessionFactory.openSession(); //ya tenemos creada la session
		return session;
	}
}
