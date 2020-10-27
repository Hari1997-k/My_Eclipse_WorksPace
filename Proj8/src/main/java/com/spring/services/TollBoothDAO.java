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
import com.spring.domain.TollBooth;
@Repository
@Transactional
public class TollBoothDAO {
    @Autowired
	private SessionFactory sessionFactory;

    public TollBooth getToll(Integer laneNumber,Plaza plazaIns) {
        
        TollBooth tollBooth = null;
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from TollBooth where laneNumber=:x and plaza_id=:y");
        q.setInteger("x",laneNumber);
        q.setInteger("y", plazaIns.getId());
        List l = q.list();
        Iterator ite = l.iterator();
        while(ite.hasNext()) {
            tollBooth = (TollBooth)ite.next();
        }
        return tollBooth;
    }
}
