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
    	emp.setEid(2000);
    	emp.setEname("Hari_k");emp.setErole("Software Engineer");
    	Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session ssn = sf.openSession();
    	Transaction txn = ssn.beginTransaction();
    	ssn.save(emp);
    	txn.commit();
    	
    	//EXAMPLE GET METHOD :
    	System.out.println("EXAMPLE GET METHOD :");
    	Employee em = ssn.get(Employee.class, new Integer(1000));
    	System.out.println(em.getEid()+"\n"+em.getEname()+"\n"+em.getErole());
    	
    	//EXAMPLE LOAD METHOD :
    	System.out.println("EXAMPLE LOAD METHOD :");
    	Employee em1 = ssn.load(Employee.class, new Integer(1000));
    	System.out.println(em1.getEid()+"\n"+em1.getEname()+"\n"+em1.getErole());
    	}
}
