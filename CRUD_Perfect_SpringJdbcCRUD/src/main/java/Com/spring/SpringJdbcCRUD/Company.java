package Com.spring.SpringJdbcCRUD;

public class Company {
	private int cid ;
	private String cname ;
	private String ctype ;
	
	public Company() {
		
	}
	public Company(int cid, String cname, String ctype) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ctype = ctype;
	}
	
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
