package Hibernate_Config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Models.Food;
import Models.User;
import Models.UserFood;

public class Hibernate_Config {
	public SessionFactory getSessionFactory() {
		Configuration con = new Configuration().configure().addAnnotatedClass(User.class).addAnnotatedClass(Food.class).addAnnotatedClass(UserFood.class);
		SessionFactory sf = con.buildSessionFactory();
		return sf;
	}

}
