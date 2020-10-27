package com.spring.DAO;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.domain.User;
@Repository
@Transactional
public class UserDAO {
	private String val="";
	int idd = 0;

	@Autowired
	private SessionFactory sessionFactory;
	public User checkUserExist(String userName,String password) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from User where userName=:name and password=:pass");
		q.setParameter("name",userName);
		q.setParameter("pass",password);
		User user = (User) q.uniqueResult();
		return user;
	}
	
	public User getUserById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from User where id=:id");
		q.setParameter("id",id);
		User user = (User) q.uniqueResult();
		//val=user.getUserName();
		idd =id ;
		
		
		return user;
	}
	public void editMyAccount(User userIns) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createSQLQuery("update User set address=:add,gender=:gender,mobile=:mobile,password=:pass,email=:email,dob=:dob,userName=:user where id=:id");
		q.setParameter("id",idd);
		q.setParameter("add",userIns.getAddress());
		q.setParameter("dob",userIns.getDob());
		q.setParameter("gender",userIns.getGender());
		q.setParameter("mobile",userIns.getMobile());
		q.setParameter("pass",userIns.getPassword());
		q.setParameter("user",userIns.getUserName());
		q.setParameter("email",userIns.getEmail());
		System.out.println(userIns.getEmail());
		q.executeUpdate();
		
	}
}
