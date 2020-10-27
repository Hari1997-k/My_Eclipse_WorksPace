package Com.Hibe.HibernateFetching;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private int cid ;
	private String cname ;
	private String cprice ;
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
	public String getCprice() {
		return cprice;
	}
	public void setCprice(String cprice) {
		this.cprice = cprice;
	}
	
	
}
