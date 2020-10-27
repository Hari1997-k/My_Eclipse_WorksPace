package com.spring.services;

import java.sql.SQLException;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.domain.Trips;
@Repository
@Transactional 
public class TripsDAO {
    @Autowired
    private SessionFactory sessionFactory;
    public Boolean saveTrips(Trips tripsIns) throws SQLException{
        Boolean result = true;
		Session session = sessionFactory.getCurrentSession();
		session.persist(tripsIns);
		//session.save(tripsIns);

       
        return result;
    }
    
}
