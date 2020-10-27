package Com.Hibe.HibernateFetching;

import java.util.ArrayList;
import java.util.List;

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
    	Student st = new Student();
    	st.setSid(10);
    	st.setSbranch("CSE");
    	st.setSname("HARI");
    	
    	Course cs = new Course();
    	cs.setCid(10);
    	cs.setCname("Java");
    	cs.setCprice("5000");
    	
    	List<Course> clist = new ArrayList<Course>();
    	clist.add(cs);
    	st.setCourse(clist);
    	
    	
    	Configuration con = new Configuration().configure("Hibernate.CFG.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Course.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session ssn = sf.openSession();
    	Transaction tx = ssn .beginTransaction();
    	Student s= ssn.get(Student.class, 10);
    	System.out.println(s.getSname());
    	//ssn.save(st);
    	//ssn.save(cs);
    	tx.commit();
    	
    	
    	
    	
    }
}
