package com.spring.DAO;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.spring.domain.Plaza;
public class PlazaDAO {
	public List<Plaza> listPlaza() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query q = session.createQuery("from Plaza");
		@SuppressWarnings("unchecked")
		List<Plaza> plazaList = q.list();
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		return plazaList;
	}
	public Boolean deletePlaza(Plaza plazaIns) {
		Boolean bool = false;
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query q = session.createQuery("delete from Plaza where id=:id");
		q.setParameter("id",plazaIns.getId());
		int row = q.executeUpdate();
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		if(row>0) {
			bool = true;
		}
		return bool;
	}
}
