package Com.hibernate.HibernateWithoutAnnotation;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
@NamedQuery(name = "getCmpById", query = "from Company where cid=:cid")
@Entity
public class Company {
	private int cid;
	private String cname ;
	private String ctype;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	
	

}
