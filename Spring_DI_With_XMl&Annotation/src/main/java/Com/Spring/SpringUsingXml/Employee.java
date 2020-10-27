package Com.Spring.SpringUsingXml;

public class Employee {
	private int eid;
	private String ename;
	private String erole;
	private Address address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, String erole, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.erole = erole;
		this.address = address;
	}
	
	public void show() {
		System.out.println(" Employee : eid=" + eid + ", ename=" + ename + ", erole=" + erole + "\n address :" + address);
}


	

}
