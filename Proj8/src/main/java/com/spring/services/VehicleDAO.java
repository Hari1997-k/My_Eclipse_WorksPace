package com.spring.services;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.domain.Vehicle;

@Repository
@Transactional
public class VehicleDAO {
@Autowired
private SessionFactory sessionFactory;
      public Vehicle getVehicleByNumberPlate(String numberPlate) {
    	  System.out.println("Vehicl DAO");
        Vehicle vehicleIns = null;
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Vehicle where numberPlate=:x");
        q.setString("x", numberPlate);
        List l = q.list();
        Iterator ite = l.iterator();
        while(ite.hasNext()) {
            vehicleIns = (Vehicle)ite.next();
        }
        return vehicleIns;
      }
    
}
