import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class App {
	private static Configuration con ;
	private static SessionFactory sf ;
	private static Session ssn ;
	private static  Transaction tx ;
	
	public static void main(String[] args) {
		App ap = new App();
//CREATE ACTOR :		
		/*Actor act = new Actor();
		act.setAid(500);
		act.setAname("Vindiesel");
		act.setArole("Action_Hero");
		ap.CreateActor(act);*/
//ACTORlIST :		
		
		  /*List<Actor> alist = ap.ActorList();
		  for(Actor aa : alist) {
		  System.out.println(aa.getAid()+"\t\t"+aa.getAname()+"\t\t"+aa.getArole());
		  }*/

//getActorById:
		
		/*
		 * List<Actor> alist = ap.getActorById(100); for(Actor aa : alist) {
		 * System.out.println(aa.getAid()+"\t\t"+aa.getAname()+"\t\t"+aa.getArole()); }
		 */
//getActorByName :		
		
	/*	List<Actor> alist = ap.getActorByName("Vindiesel");
		for (Actor aa : alist) {
			System.out.println(aa.getAid() + "\t\t" + aa.getAname() + "\t\t" + aa.getArole());
		}
		 
	}*/
		
//TICKETS LIST :
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter booked visitor name");
		String name = sc.next();
		List<Ticket> tlist = ap.listTicketsByBookedBy(name);
		if(tlist.size()==0) {
			System.out.println("EmptyList");
		}
		else {
			System.out.printf("%-15s %-15s %-15s %s\n","Id","Booked by","Event","Price");
			
			for(Ticket tt:tlist) {
				System.out.printf("%-15s %-15s %-15s %s\n" , tt.getId() , tt.getBookedBy().equals(name) , tt.getEevnt() , tt.getPrice());
			}}
		sc.close();
	

	}	
	public void CreateActor(Actor a) {
		con = new Configuration().configure("hibernateCFG.xml").addAnnotatedClass(Actor.class);
		sf = con.buildSessionFactory();
		ssn = sf.openSession();
		tx = ssn.beginTransaction();
		ssn.save(a);
		tx.commit();
		
	}
	
	public List<Actor> ActorList(){
		con = new Configuration().configure("hibernateCFG.xml").addAnnotatedClass(Actor.class);
		sf = con.buildSessionFactory();
		ssn = sf.openSession();
		Criteria c = ssn.createCriteria(Actor.class);
		List<Actor> alst = c.list();
		return alst ;
		
	}
	public List<Actor> getActorById(int aid){
		con = new Configuration().configure("hibernateCFG.xml").addAnnotatedClass(Actor.class);
		sf = con.buildSessionFactory();
		ssn = sf.openSession();
		Criteria c = ssn.createCriteria(Actor.class);
		c.add(Restrictions.eq("Aid", aid));
		List<Actor> alst = c.list();
		return alst ;
	}
	
	/*
	 * public List<Actor> getActorByName(String aname){ HibernateUtil util = new
	 * HibernateUtil(); Configuration con1 =
	 * util.getConfiguration().addAnnotatedClass(Actor.class); sf =
	 * con1.buildSessionFactory(); ssn = sf.openSession(); Criteria c =
	 * ssn.createCriteria(Actor.class); c.add(Restrictions.eq("Aname" , aname));
	 * List<Actor> alst = c.list(); return alst;
	 * 
	 * }
	 */
	
	@SuppressWarnings("unchecked")
	public List<Ticket> listTicketsByBookedBy(String bookedBy) {
		Session ssn = HibernateUtil.getSessionFactory().openSession();
		Criteria ctr = ssn.createCriteria(Ticket.class);
		ctr.add(Restrictions.eq("bookedBy", bookedBy));
		List<Ticket> tls = ctr.list();
		return tls;

	}
	

}
