import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Actor {
	@Id
	private int Aid ;
	private String Aname ;
	private String Arole;
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	public String getArole() {
		return Arole;
	}
	public void setArole(String arole) {
		Arole = arole;
	}
	
}
