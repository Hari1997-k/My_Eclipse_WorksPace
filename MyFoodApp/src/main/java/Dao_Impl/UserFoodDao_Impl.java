package Dao_Impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import DAO.UserFood_DAO;
import Hibernate_Config.Hibernate_Config;
import Models.UserFood;

public class UserFoodDao_Impl implements UserFood_DAO {
	Hibernate_Config config = new Hibernate_Config();	
	Session ssn = config.getSessionFactory().openSession();
	Transaction txn = ssn.beginTransaction();


	public void save(UserFood ufd) {
		ssn.save(ufd);
		txn.commit();
		
	}

}
