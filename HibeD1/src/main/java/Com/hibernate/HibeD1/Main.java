package Com.hibernate.HibeD1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Student st = new Student();
		st.setSbranch("Computers");
		st.setSgrade("A grade");
		st.setSname("Hari_k");
		st.setSid(243);
		Configuration con = new Configuration().configure("/src/main/java/Com/hibernate/HibeD1/hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ssn = sf.openSession();
		Transaction txn = ssn.beginTransaction();
		ssn.save(st);
		txn.commit();
		
		
	}
	

}
