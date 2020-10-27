package Com.Hibe.HibernateMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Student {
	@Id
	private  int sid ;
	private String sname ;
	private String srade ;	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Laptop> laptop ;
	
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSrade() {
		return srade;
	}
	public void setSrade(String srade) {
		this.srade = srade;
	}
	
	

}
