package Com.hibernate.HibePractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Employee emp = new Employee();
    	emp.setEid(1000);
    	emp.setEname("Hari.k");emp.setErole("Devops Engineer");
    	Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session ssn = sf.openSession();
    	Transaction txn = ssn.beginTransaction();
    	ssn.save(emp);
    	ssn.persist(emp);
    	txn.commit();
    	//EXAMPLE GET METHOD :
    	Employee em = ssn.get(Employee.class, new Integer(1));
    	System.out.println(em.getEid()+"\n"+em.getEname()+"\n"+em.getErole());
    	//EXAMPLE LOAD METHOD :
    	Employee em1 = ssn.load(Employee.class, new Integer(1));
    	System.out.println(em1.getEid()+"\n"+em1.getEname()+"\n"+em1.getErole());
    	}
}
