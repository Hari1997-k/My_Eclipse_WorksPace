package Com.hibernate.HibernateWithoutAnnotation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{	private  Configuration con;
	private static  SessionFactory sf = null;
	public static void main( String[] args )
    {
    	App ap = new App();
    	ap.CreateCompany(2 , "TajBanzara" ,"Hotel");
    	ap.GetCompanyById(10);
    	//ap.retriveCompany();
    	//ap.deleteCompanyById(5);
    	//ap.updateCompanyByName("Raghuu");
    	//ap.updateCompanyByName("Diamond+" , "Product Based");   
    	//ap.UpdateCmpnyById(4);
    	//ap.UpdateCmpnyById(234);
    	//ap.deleteByCname("WIPRO");
    	//System.out.println("Hey");
    	//ap.updateCmpnyBy_NameAnd_Type("Delloit", "MNC");
}

	
	public void CreateCompany(int cid, String cname, String ctype) {
		System.out.println(cname + " Company Created");
		Company cmpny = new Company();
		cmpny.setCid(cid);
		cmpny.setCname(cname);
		cmpny.setCtype(ctype);
		con = new Configuration().configure();
		sf = con.buildSessionFactory();
		Session ssn = sf.openSession();
		Transaction txn = ssn.beginTransaction();
		ssn.save(cmpny);
		txn.commit();
	}

	public void retriveCompany() {
		con = new Configuration().configure();
		sf = con.buildSessionFactory();
		Session ssn = sf.openSession();
		List<Company> clst = ssn.createQuery("from Company").list();
		for (java.util.Iterator itr = clst.iterator(); itr.hasNext();) {
			Company cmpny = (Company) itr.next();
			System.out.println("Company Details :\n CompanyName :" + cmpny.getCname() + "\n");
		}
	}
	  
	public void deleteCompanyById(int cid) {
		con = new Configuration().configure();
		sf = con.buildSessionFactory();
		Session ssn = sf.openSession();
		Query q1 = ssn.createQuery("from Company where cid=:cid");
		q1.setInteger("cid", cid);
		Company cmp1 = (Company) q1.uniqueResult();
		Transaction txn = ssn.beginTransaction();
		ssn.delete(cmp1);
		txn.commit();

	}

	public void updateCompanyByName(String cname, String ctype) {
		con = new Configuration().configure();
		sf = con.buildSessionFactory();
		Session ssn = sf.openSession();
		Query q = ssn.createQuery("from Company where cname=:cname and ctype=:ctype");
		q.setString("cname", cname);
		q.setString("ctype", ctype);
		Company cmpny = (Company) q.uniqueResult();
		cmpny.setCname("ONFashion+");
		cmpny.setCtype("Clothing");
		Transaction txn = ssn.beginTransaction();
		ssn.update(cmpny);
		txn.commit();
	}
	  
	public void UpdateCmpnyById(int cid) {
		con = new Configuration().configure();
		sf = con.buildSessionFactory();
		Session ssn = sf.openSession();
		String hql = "update Company   where cid=? ";
		Query query = ssn.createQuery(hql);
		query.setInteger("id", cid);
		Company cmp = new Company();
		cmp.setCid(12);
		Transaction txn = ssn.beginTransaction();
		query.executeUpdate();
		txn.commit();
	}
	 
	public void deleteByCname(String cname) {
		con = new Configuration().configure();
		sf = con.buildSessionFactory();
		Session ssn = sf.openSession();
		Query q = ssn.createQuery("from Company where cname=:cname");
		q.setString("cname", cname);
		Company cpy = (Company) q.uniqueResult();
		Transaction txn = ssn.beginTransaction();
		ssn.delete(cpy);
		txn.commit();
	}
	
	
	  public void updateCmpnyBy_NameAnd_Type(String cname , String ctype) { con =
	  new Configuration().configure(); sf = con.buildSessionFactory(); Session ssn
	  = sf.openSession(); Query q =
	  ssn.createQuery("from Company where cname=:cname and ctype=:ctype");
	  q.setString("cname", cname); q.setString("ctype", ctype); Company cmpny =
	  (Company) q.uniqueResult(); cmpny.setCname("Cognizant") ;
	  cmpny.setCtype("Service based"); Transaction txn = ssn.beginTransaction();
	  ssn.update(cmpny); txn.commit();
	  
	  
	  
	  }
	  
	  public void GetCompanyById(int cid) {
		  con = new Configuration().configure();
			sf = con.buildSessionFactory();
			Session ssn = sf.openSession();
		  Query q = ssn.getNamedQuery("getCmpById");
		  q.setInteger("cid", cid);
		  List<Company> clist = q.list();
		  for(Company cp : clist) {
			  System.out.println(cp.getCtype());
		  }
		  
	  }
	 
}
    


 
       
           	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
   
        
        
        
        
        
       
       