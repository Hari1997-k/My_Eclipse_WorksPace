package OOPS_Concept_Practice;

public class Company {
	private String Cname;
	private String Ctype;
	private String Crank;

	public Company() {

	}

	public Company(String cname, String ctype, String crank) {
		super();
		Cname = cname;
		Ctype = ctype;
		Crank = crank;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public String getCtype() {
		return Ctype;
	}

	public void setCtype(String ctype) {
		Ctype = ctype;
	}

	public String getCrank() {
		return Crank;
	}

	public void setCrank(String crank) {
		Crank = crank;
	}

}
