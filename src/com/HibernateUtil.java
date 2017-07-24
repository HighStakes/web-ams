package com;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	 private static ServiceRegistry serviceRegistry;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
//			Configuration configuration = new Configuration();
//			configuration.configure("hibernate.cfg.xml");
//			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
//			Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
//			StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(
//			            cfg.getProperties());
//			sessionFactory= cfg.buildSessionFactory(builder.build());
			
			Configuration configuration = new Configuration().configure();
		      
		     serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
		     sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}

		return sessionFactory;
	}
}
