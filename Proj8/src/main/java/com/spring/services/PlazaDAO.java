package com.spring.services;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.domain.Plaza;
@Repository
@Transactional
public class PlazaDAO {   
	@Autowired
	private SessionFactory sessionFactory;
    
    public List<Plaza> listPlaza() {
        List<Plaza> plaza = null;
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Plaza");
        plaza = q.list();
        return plaza;
    }
    
    public Plaza getPlazaByName(String plazaName) {
        
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Plaza where name=:x");
        q.setString("x", plazaName);
        List l = q.list();
        Iterator ite = l.iterator();
        Plaza plazaIns = null;
        while(ite.hasNext()) {
            plazaIns = (Plaza)ite.next();
        }
        return plazaIns;
    }
}
