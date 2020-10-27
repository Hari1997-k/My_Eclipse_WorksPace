package com.spring.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.domain.User;
@Repository
@Transactional
public class UserDAO {
	private String val="";
	Integer idd = 0;
	Integer ide = 0;
	@Autowired
	private SessionFactory sessionFactory;
	public Integer UsersList(String Username) {
		Session session = sessionFactory.getCurrentSession();
		Criteria  c = session.createCriteria(User.class);
		c.add(Restrictions.eq("userName", Username));
		List<User> ulist = c.list();
		System.out.println();
		for(User uu : ulist)
		ide = uu.getId();
		return ide;
	}
	
	public User checkUserExist(String userName,String password) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from User where userName=:name and password=:pass");
		q.setParameter("name",userName);
		q.setParameter("pass",password);
		User user = (User) q.uniqueResult();
		idd = user.getId();
		return user;
	}
	
	
	public User getUserById(Integer idd) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from User where id=:id");
		q.setParameter("id",idd);
		User user = (User) q.uniqueResult();
		return user;
	}
	public void editMyAccount(User userIns) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("update User set address=:add,gender=:gender,mobile=:mobile,password=:pass,email=:email,dob=:dob,userName=:user where id=:id");
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
