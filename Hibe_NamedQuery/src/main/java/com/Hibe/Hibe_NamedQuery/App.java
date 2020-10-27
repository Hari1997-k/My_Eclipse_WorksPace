package com.Hibe.Hibe_NamedQuery;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	private static Configuration con ;
	private static SessionFactory sf ;
	private  static Session ssn ;
	private static Transaction tx ;
	
	public static void main( String[] args )
    {
		
	App ap = new App();

//createVoter :
	//ap.createVoter();
	
//getVoterById :
	
	/*List<Voter> vlist = ap.getVoterById(10);
	for(Voter vv : vlist) {
		System.out.println("Vid\t\t"+"Vname\t\t"+"Vrole");
		System.out.println(vv.getVid()+"\t\t"+vv.getVname()+"\t\t"+vv.getVrole());
	}*/
//getVoterByName :
	
	/*List<Voter> vlist = ap.getVoterByName("Ravi");
	for(Voter vv : vlist) {
		System.out.println("Vid\t\t"+"Vname\t\t"+"Vrole");
		System.out.println(vv.getVid()+"\t\t"+vv.getVname()+"\t\t"+vv.getVrole());
	}*/
//getVoterByIdAndName:
	/*List<Voter> vlst = ap.getVoterByIdandName(10, "Ravi");
	for(Voter vv : vlst) {
		System.out.println("Vid\t\t"+"Vname\t\t"+"Vrole");
		System.out.println(vv.getVid()+"\t\t"+vv.getVname()+"\t\t"+vv.getVrole());
	}*/
//updateById :
		//ap.updateById(10, "RowenRao", "SuperModel");
//updateByName :		
	   // ap.updateByName("Hari", "RJ");
//updateNameAndRole	
		//ap.updateNameAndRole("RowenRao", "SuperModel");
//getVoters :	
	/*List<Voter> vlst = ap.getVoters(10);
	for(Voter vv : vlst) {
		System.out.println("Vid\t\t"+"Vname\t\t"+"Vrole");
		System.out.println(vv.getVid()+"\t\t"+vv.getVname()+"\t\t"+vv.getVrole());
	}*/
//VotersList :	
	List<Voter> vlst = ap.VotersList();
	for(Voter vv : vlst) {
		System.out.println("Vid\t\t"+"Vname\t\t"+"Vrole");
		System.out.println(vv.getVid()+"\t\t"+vv.getVname()+"\t\t"+vv.getVrole());
	}
    }	
	
	public void createVoter() {
		Voter vt = new Voter();
		vt.setVid(40);
		vt.setVname("Bunny");
		vt.setVrole("Gamming Developer");
		con = new Configuration().configure("hibernateCFG.xml").addAnnotatedClass(Voter.class);
		sf = con.buildSessionFactory();
		ssn = sf.openSession();
		tx = ssn.beginTransaction();
		ssn.save(vt);
		tx.commit();
	}
	
	public List<Voter> getVoterById(int vid){
		con = new Configuration().configure("hibernateCFG.xml").addAnnotatedClass(Voter.class);
		sf = con.buildSessionFactory();
		ssn = sf.openSession();
		Query q = ssn.getNamedQuery("getVoterById");
		q.setParameter("vid", vid);
		List<Voter> vlist = q.list();
		return vlist;
		

	}
	
	public List<Voter> getVoterByName(String vname){
		con = new Configuration().configure("hibernateCFG.xml").addAnnotatedClass(Voter.class);
		sf = con.buildSessionFactory();
		ssn = sf.openSession();
		Query q = ssn.getNamedQuery("getVoterByName");
		q.setString("vname", vname);
		List<Voter> vlist = q.list();
		return vlist;
		
	}
	
	public List<Voter> getVoterByIdandName(int vid , String vname){
		con = new Configuration().configure("hibernateCFG.xml").addAnnotatedClass(Voter.class);
		sf = con.buildSessionFactory();
		ssn = sf.openSession();
		Query q = ssn.getNamedQuery("getVoterByIdAndName");
		q.setInteger("vid" , vid);
		q.setString("vname" , vname);
		List<Voter> vlist = q.list();
		return vlist;
		
		
	}
	
	public void updateById(int vid, String vname, String vrole) {
		con = new Configuration().configure("hibernateCFG.xml").addAnnotatedClass(Voter.class);
		sf = con.buildSessionFactory();
		ssn = sf.openSession();
		Query q = ssn.createQuery("from Voter where vid=:vid");
		q.setInteger("vid", vid);
		Voter vtr = (Voter) q.uniqueResult();
		vtr.setVname(vname);
		vtr.setVrole(vrole);
		tx = ssn.beginTransaction();
		ssn.update(vtr);
		tx.commit();

	}
	 
	public void updateByName(String vname , String vrole) {
		con = new Configuration().configure("hibernateCFG.xml").addAnnotatedClass(Voter.class);
		sf = con.buildSessionFactory();
		ssn = sf.openSession();
		Query q = ssn.createQuery("from Voter where vname=:vname");
		Voter vtr = (Voter) q.uniqueResult();
		vtr.setVrole(vrole);
		tx = ssn.beginTransaction();
		ssn.update(vtr);
		tx.commit();
		
		
	}
	public void updateNameAndRole(String vname , String vrole) {
		con = new Configuration().configure("hibernateCFG.xml").addAnnotatedClass(Voter.class);
		sf = con.buildSessionFactory();
		ssn = sf.openSession();
		Query q = ssn.createQuery("from Voter where vname=:vname and vrole=:vrole");
		q.setString("vname" , vname);
		q.setString("vrole" , vrole);
		Voter vtr = (Voter) q.uniqueResult();
		q.setString("vname" , vname);
		vtr.setVname("JhONY");
		vtr.setVrole("Actor");
		tx = ssn.beginTransaction();
		ssn.update(vtr);
		tx.commit();
		
		
	}
	
	public List<Voter> getVoters(int vid){
		con = new Configuration().configure("hibernateCFG.xml").addAnnotatedClass(Voter.class);
		sf = con.buildSessionFactory();
		ssn = sf.openSession();
		Query q = ssn.createQuery("from Voter where vid=:vid");
		q.setInteger("vid", vid);
		List<Voter> vlist = q.list();
		return vlist;
		
	}
	public List<Voter> VotersList(){
		con = new Configuration().configure("hibernateCFG.xml").addAnnotatedClass(Voter.class);
		sf = con.buildSessionFactory();
		ssn = sf.openSession();
		Query q = ssn.createQuery("From Voter");
		List<Voter> vlist = q.list();
		return vlist;

}
	
}