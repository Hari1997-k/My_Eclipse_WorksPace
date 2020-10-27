package com.spring.DAO;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.domain.Role;

@Repository
@Transactional
public class RoleDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public Role getRoleById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Role where id=:id");
		q.setParameter("id", id);
		Role role = (Role) q.uniqueResult();
		return role;
	}

}