package com.spring.services;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.spring.domain.User;

@Service

public class UserService {

	Criteria criteria = null;
	@Autowired
	public SessionFactory sessionFactory;

	@Autowired
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public Boolean saveUser(User userIns) {
		sessionFactory.getCurrentSession().saveOrUpdate(userIns);
		return true;
	}

	@Transactional
	public User checkUserExist(String userName,String password) {
		criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("userName", userName));
		criteria.add(Restrictions.eq("password", password));
		return (User) criteria.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> listUser() {
		criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.isNotNull("role"));
	    return (List<User>) criteria.list();
	}
	
	@Transactional
	public User getUserById(Integer id) {
		criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("id", id));
		return (User) criteria.uniqueResult();
	}
	
	@Transactional 
	public Boolean editUser(User userIns) {
		sessionFactory.getCurrentSession().update(userIns);
		return true;
	}
	
	@Transactional
	public Boolean deleteUser(User userIns) {
		sessionFactory.getCurrentSession().delete(userIns);
		return true;
	}
}
