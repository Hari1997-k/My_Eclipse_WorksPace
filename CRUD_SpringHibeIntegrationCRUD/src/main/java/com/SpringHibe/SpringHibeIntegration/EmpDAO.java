package com.SpringHibe.SpringHibeIntegration;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;
@Transactional 
public class EmpDAO {
	private SessionFactory sessionfactory ;

	public  SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public  void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}
	
	
	public void createEmployee (Employee e) {
		Session ssn = sessionfactory.openSession();
		Transaction tx = ssn.beginTransaction();
		ssn.save(e);
		tx.commit();
	}
	
	public void deleteEmployee(int id) {
		Session ssn = sessionfactory.openSession();

		Query q = ssn.createQuery("from Employee where eid=:id");
		q.setInteger("id", id);
		Employee emp = (Employee) q.uniqueResult();
		Transaction tx = ssn.beginTransaction();
		ssn.delete(emp);
		tx.commit();
	}
	
	
	public void updateEmployee (String ename) {
		Session ssn = sessionfactory.openSession();
		Query q = ssn.createQuery("from Employee where ename=:ename");
			q.setString("ename", ename);
		Employee e = (Employee) q.uniqueResult();
		//e.setEid(23);
		e.setErole("DataAnalyst");
		Transaction tx = ssn.beginTransaction();
		ssn.update(e);
		tx.commit();
		}
	
	
	public List<Employee> getEmployee(){
		Session ssn = sessionfactory.openSession();
		List<Employee> elst = ssn.createQuery("from Employee").list();
		return elst;
		}
	
	
	
	public void updatEmpByName(String ename) {
		Session ssn = sessionfactory.openSession();
		Query q = ssn.createQuery("from Employee where ename=:ename");
		q.setString("ename", ename);
		Employee e= (Employee) q.uniqueResult();
		e.setErole("RASCAL");	
		Transaction tx = ssn.beginTransaction();
		 ssn.update(e);
		tx.commit();
		
			}
	
	
	public List<Employee> getEmpByName(String ename){
		Session ssn = sessionfactory.openSession();
		Query q = ssn.createQuery("from Employee where ename=:ename");
		q.setString("ename" , ename);
		List<Employee> elist = q.list();
		return elist;
	}
	
	
	
	public List<Employee> getEmpById(int eid){
		Session ssn = sessionfactory.openSession();
		Query q = ssn.createQuery("from Employee where eid=:eid");
		q.setInteger("eid" , eid);
		List<Employee> elist = q.list();
		return elist;
	}
 		
	}
	

