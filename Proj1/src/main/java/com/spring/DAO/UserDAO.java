package com.spring.DAO;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.domain.User;
@Repository
@Transactional
public class UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public void saveUser(User userIns) {
		Session session = sessionFactory.getCurrentSession();
		session.save(userIns);
	}
}
