package com.zettamine.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConfigurationUtility {
	private static Configuration config;
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		
		if (config == null) {
			config = new Configuration();
			config.configure("hibernate.cfg.xml");

			 sessionFactory = config.buildSessionFactory();
			return sessionFactory;
		}

		return sessionFactory;
	}
}
