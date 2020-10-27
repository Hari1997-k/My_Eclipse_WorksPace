package Com.hibernate.HibeDemo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	    public static void main(String[] args) {
		System.out.println("Hello Hibernate ");
		Employee  e = new Employee() ;
		e.setEid(10202);
		e.setEname("Hari");
		e.setErole("FullStack");
Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
SessionFactory sf = con.buildSessionFactory();
Session ssn = sf.openSession();
org.hibernate.Transaction txn = ssn.beginTransaction();
ssn.save(e);

txn.commit();
	}
	}
