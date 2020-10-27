package OOPS_Concept_Practice;

public class Employee {

	private int eid;
	private String ename;
	private String erole;
	private Company ecompany;
	private Address eaddress;

	public Employee() {

	} 

	public Employee(int eid, String ename, String erole, Company ecompany, Address eaddress) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.erole = erole;
		this.ecompany = ecompany;
		this.eaddress = eaddress;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getErole() {
		return erole;
	}

	public void setErole(String erole) {
		this.erole = erole;
	}

	public Company getEcompany() {
		return ecompany;
	}

	public void setEcompany(Company ecompany) {
		this.ecompany = ecompany;
	}

	public Address getEaddress() {
		return eaddress;
	}

	public void setEaddress(Address eaddress) {
		this.eaddress = eaddress;
	}

}
