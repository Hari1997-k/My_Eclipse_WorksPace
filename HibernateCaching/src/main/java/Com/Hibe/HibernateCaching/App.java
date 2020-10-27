package Com.Hibe.HibernateCaching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
  //FIRST LEVEL CACHE :
    	/*==> 1ST Level cache is by defaultly asociated with session that  means if ur firing same query within a particular session then the query womnt be fired to database 
    	 * bcoz the query is used within the session which will be stored within the application server of the session .
    	 * */
 //	EXAMPE FOR 1ST LEVEL CACHE :
    	/*IN THE BELOW EXAMPLE EVENTHOUGH WE ARE GETTING THE DETAILS OF CMPNY WITH ID 10, 
    	THE QUERY IS FIRED TWO TIMES BCOZ WE R USING TWO SESSIONS AND
    	 WE R DNG SAME OPERATION FROM DIFFERENT SESSIONS SO HIBERNATE IS FIRING TWO QUERIES*/
    	
    	Configuration con = new Configuration().configure("Hibernate.CFG.xml").addAnnotatedClass(Company.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session ssn = sf.openSession();
    	Transaction tx = ssn.beginTransaction();
    	System.out.println("from session 0 , cmpny 0 :");
    	Company c = ssn.get(Company.class , 10);
    	System.out.println(c.getCname());   
    	tx.commit();
    	
    	Configuration con1 = new Configuration().configure("Hibernate.CFG.xml").addAnnotatedClass(Company.class);
    	SessionFactory sf1 = con1.buildSessionFactory();
    	Session ssn1 = sf1.openSession();
    	Transaction tx1= ssn1.beginTransaction();
    	System.out.println("From Session 1 . Cmony 1 :");
    	Company c2 = ssn1.get(Company.class , 10);
    	System.out.println(c2.getCname());   
    	tx1.commit();
    	
    	Configuration con2 = new Configuration().configure("Hibernate.CFG.xml").addAnnotatedClass(Company.class);
    	SessionFactory sf2 = con1.buildSessionFactory();
    	Session ssn2 = sf1.openSession();
    	Transaction tx2= ssn2.beginTransaction();
    	System.out.println("From Session 2 . Cmony 2 :");
    	Company c3 = ssn1.get(Company.class , 10);
    	System.out.println(c3.getCname());   
    	tx2.commit();
    	
    	
    	
    	
}
}
