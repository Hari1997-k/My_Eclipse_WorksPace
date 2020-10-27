package Dao_Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import DAO.Food_Dao;
import Hibernate_Config.Hibernate_Config;
import Models.Food;

public class Food_Dao_Impl implements Food_Dao {
	Hibernate_Config config = new Hibernate_Config();	
	Session ssn = config.getSessionFactory().openSession();
	Transaction txn = ssn.beginTransaction();

	public void AddFood(Food food) {
		
		ssn.beginTransaction();
		ssn.save(food);
		txn.commit();

	}

	public void DeleteFood() {
		// TODO Auto-generated method stub

	}

	public void UpdateFood() {
		// TODO Auto-generated method stub

	}

	public void EditFood() {
		// TODO Auto-generated method stub

	}

	public List<Food> View_FoodItems() {
		Query q = ssn.createQuery("from Food");
		List<Food> flist = q.list();
		return flist;
	}

}
