package com.spring.services;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.domain.Fare;
import com.spring.domain.Plaza;
@Repository
@Transactional
public class FareDAO {
	@Autowired
	private SessionFactory sessionFactory;
    public Fare getFareById(Integer id) {
    	
        Fare fareIns = null;
		Session session = sessionFactory.getCurrentSession();

        Query q = session.createQuery("from Fare where id=:x");
        q.setInteger("x", id);
        List l = q.list();
        Iterator ite = l.iterator();
        while(ite.hasNext()) {
            fareIns = (Fare)ite.next();
        }
        return fareIns;
    }
    
    
    public Fare getFare(Plaza plazaIns,String vehicleType){
        Fare fareIns = null;
		Session session = sessionFactory.getCurrentSession();
		Query q1 = session.createQuery("from Plaza where name=:x");
        q1.setString("x", plazaIns.getName());
        List l1 = q1.list();
        Iterator ite1 = l1.iterator();
        int plaza_id = 0;
        while(ite1.hasNext()) {
            Plaza plaza = (Plaza)ite1.next();
            plaza_id = plaza.getId();
        }
        
        Query q2 = session.createQuery("from Fare where vehicleType=:x and plaza_id=:y");
        q2.setString("x", vehicleType);
        q2.setInteger("y", plaza_id);
        List l2 = q2.list();
        Iterator ite2 = l2.iterator();
        while(ite2.hasNext()) {
            fareIns = (Fare)ite2.next();
        }
        return fareIns;
    }
}
