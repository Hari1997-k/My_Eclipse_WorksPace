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
 //SECOND LEVEL CACHE :
    	/*
    	   	==> NO MATTER  IN WHICH SESSION  U WROTE THE QUERY IF U WANT TO REUSE THE QUERY THAT U FIRED ONCE IN UR APPLICATION 
    	 	    THEN GO FOR SECOND LEVEL CACHE WHICH WILL STORE THE DATA WITHIN UR APPLICATION, 
    	 	    SO U CAN reuse the data once u used in  your application  .
    	    
    	    ==> BY DEFAULTLY SECOND LEVEL CACHE IS NOT ENABLED WE HAVE TO ENABLE IT MANUALLY 
    	 	
    	 	==> TO WORK WITH THIS SECOND LEVEL CACHE U HAVE TO ADD THE DEPENDENCIES OF THE CACHE THAT U WANT TO WORK WITH ,
    	 	    AND ALSO THE HIBERNATE AND SECOND LEVEL CACHE INTEGRATION DEPENDNECY TOO
    	 	
    	 	==>SOME OF THE COMMONLY USED SECONDARY LEVEL CACHES AVAILABLE IN MARLET ARE : 1) OS CAHE 
    	 	     																			 2)SWAM CAHCHE 
    	 	     																			 3)EH CACHE 
    	 	   */
    	College clg = new College();
    	clg.setCid(100);
    	clg.setCname("Murliraos");
    	clg.setCtype("HSC");
//SESSION 0 :    	
    	Configuration con = new Configuration().configure("Hibernate.CFG.xml").addAnnotatedClass(College.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session ssn = sf.openSession();
    	Transaction tx = ssn.beginTransaction();
    	//ssn.save(clg);
    	System.out.println("Session 0 :");
    	College cg = ssn.get(College.class , 100);
    	System.out.println(cg.getCname());
    	tx.commit();
//SESSION 1 :  	
		
		Configuration con1 = new Configuration().configure("Hibernate.CFG.xml").addAnnotatedClass(College.class);
		SessionFactory sf1 = con1.buildSessionFactory();
		Session ssn1 = sf1.openSession();
		Transaction tx1 = ssn1.beginTransaction();
		// ssn.save(clg); 
		System.out.println("Session 1 :"); College cg1 =ssn1.get(College.class, 100);
		System.out.println(cg1.getCname());
		tx1.commit();
    	
    	
    	
    	
    	
    	
}
}
