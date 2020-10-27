package Dao_Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import DAO.User_Dao;
import Hibernate_Config.Hibernate_Config;
import Models.User;

public class User_Dao_Impl implements User_Dao {
	Hibernate_Config config = new Hibernate_Config();	
	Session ssn = config.getSessionFactory().openSession();
	Transaction txn = ssn.beginTransaction();



	public void CreateUser(User u) {

		ssn.save(u);
		txn.commit();

	}

	public void Save_User_Food(String selected_Food_Item, int id) {
		
		Query q = ssn.createQuery("update User set foodItem =:selected_Food_Item where uid =:id");
		q.setString("selected_Food_Item", selected_Food_Item);
		q.setInteger("id", id);
		ssn.beginTransaction();
		q.executeUpdate();
		txn.commit();
		

	}

	public void Edit_User_Food(String Entered_New_FoodItem, int id) {
		Query q = ssn.createQuery("Update User set foodItem=:Entered_New_FoodItem where uid=:id");
		q.setString("Entered_New_FoodItem",Entered_New_FoodItem);
		q.setInteger("id", id);
		ssn.beginTransaction();
		q.executeUpdate();
		txn.commit();
		
	}

	public void Delete_User_Food(String Old_Food_Item, int id) {
		Query q = ssn.createQuery("update User set foodItem=:Old_Food_Item where uid=:id" );
		q.setString("Old_Food_Item", null);
		q.setInteger("id", id);
		ssn.beginTransaction();
		q.executeUpdate();
		txn.commit();
		
	}

	public List<User> View_User_Food(int id) {
		Query q = ssn.createQuery("from User where uid=:id");
		q.setInteger("id", id);
		q.uniqueResult();
		List lst = q.list();
		ssn.beginTransaction();
		txn.commit();
		return lst;
		
		
		
		
		
	}

	public List<User> LoginUser(String userName, String Password) {
		Query q = ssn.createQuery("from User where uname=:userName and password=:Password");
		q.setString("userName",userName);
		q.setString("Password", Password);
		List<User> ulist = q.list();
		return ulist;
		
	}

	

}
