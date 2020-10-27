import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
public static  SessionFactory getSessionFactory() {
	ResourceBundle rb = ResourceBundle.getBundle("mysql");
	Configuration cfg = new Configuration();
    cfg.configure("hibernateCFG.xml");
    cfg.setProperty("hibernate.connection.url"     , rb.getString("db.url"));
    cfg.setProperty("hibernate.connection.username", rb.getString("db.username"));
    cfg.setProperty("hibernate.connection.password", rb.getString("db.password"));
    cfg.addAnnotatedClass(Ticket.class);
    SessionFactory sff = cfg.buildSessionFactory();
    return sff;
	
}

public static void main(String[] args) {
	App ap = new App();
	Scanner sc = new Scanner(System.in);
	Logger log = Logger.getLogger("org.hibernate");
	log.setLevel(Level.OFF);
	System.setProperty("org.apache.commons.logging.Log",
	"org.apache.commons.logging.impl.NoOpLog");
	
	System.out.println("Enter booked visitor name");
	String name = sc.next();
	List<Ticket> tlist = ap.listTicketsByBookedBy(name);
	if(tlist.size()==0) {
		System.out.println("Ticket Details");
		System.out.println("EmptyList");
	}
	else {
		System.out.println("Ticket Details");
		System.out.printf("%-15s %-15s %-15s %s\n","Id","Booked by","Event","Price");
		
		for(Ticket tt:tlist) {
			System.out.printf("%-15s %-15s %-15s %s\n" , tt.getId() , tt.getBookedBy().equals(name) , tt.getEevnt() , tt.getPrice());
		}}
	sc.close();

	
}
}
