package com.boot.WebDemoHibernateConfig;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibeConfig {
	
	@Autowired
	private EntityManagerFactory  entityManagerFactory;
	
	@Bean
	public SessionFactory getSessionFactory() {
		if(entityManagerFactory.unwrap(SessionFactory.class)==null) {
			throw new NullPointerException("Session Factory Not Found");
		}
		return entityManagerFactory.unwrap(SessionFactory.class);
	}
	

}
