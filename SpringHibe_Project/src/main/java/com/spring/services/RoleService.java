package com.spring.services;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.domain.*;


@Service
public class RoleService {
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
	public Boolean createRole(Role roleIns) {
		sessionFactory.getCurrentSession().saveOrUpdate(roleIns);
		return true;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Role> listRole() {
		criteria = sessionFactory.getCurrentSession().createCriteria(Role.class);
		return (List<Role>) criteria.list();
	}

	@Transactional
	public Role getRoleById(Integer id) {
		criteria = sessionFactory.getCurrentSession().createCriteria(Role.class);
		criteria.add(Restrictions.eq("id", id));
		return (Role) criteria.uniqueResult();
	}
	
	@Transactional
	public Role getRoleByName(String name) {
		criteria = sessionFactory.getCurrentSession().createCriteria(Role.class);
		criteria.add(Restrictions.eq("name", name));
		return (Role) criteria.uniqueResult();
	}
	
	
	@Transactional 
	public Boolean editRole(Role roleIns) {
		sessionFactory.getCurrentSession().update(roleIns);
		return true;
	}
	
	@Transactional
	public Boolean deleteRole(Role roleIns) {
		sessionFactory.getCurrentSession().delete(roleIns);
		return true;
	}
	
}