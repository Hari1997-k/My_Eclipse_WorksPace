package Com.Hibe.HibernateMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
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
    	
    	
    	Student std = new Student();
		
		
		/*
		 * std.setSid(100); std.setSname("Shyam"); std.setSrade("B+");
		 * 
		 * Laptop lp = new Laptop(); lp.setLid(100); lp.setLname("MacBook-Pro9"); List
		 * lpst = new ArrayList(); lpst.add(lp); std.setLaptop(lpst);
		 */
		 
		Configuration con = new Configuration().configure("HibernateCFG.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf = con.buildSessionFactory();
		Session ssn = sf.openSession();
		Transaction tx = ssn.beginTransaction();
        //ssn.save(std);
        //ssn.save (lp);
		Student s = ssn.get(Student.class , 100);
		System.out.println(s.getSname());
        tx.commit();
        
		/*
		 * App ap = new App(); List<Student> slist = ap.getStudent();
		 * System.out.println("sId :\t\t"+"Sname :\t\t"+"Sgrade:\t\t"+
		 * "Lid:\t\t"+"lname :"); for(Student ss : slist) {
		 * System.out.println(ss.getSid()+"\t\t"+ss.getSname()+"\t\t"+ss.getSrade()+
		 * "\t\t"+ss.getLaptop().getLid()+"\t\t"+ss.getLaptop().getLname()); }
		 */
        
        
    }
    
    public List<Student> getStudent(){

    	Configuration con = new Configuration().configure("HibernateCFG.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory sf = con.buildSessionFactory();
        Session ssn = sf.openSession();
		Criteria c = ssn.createCriteria(Student.class);
        List<Student> slst = c.list();
		return slst;
        
    	
    }
    
    
}
