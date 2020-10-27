package Model;

public class Product {

	private int pid;
	private String pname;
	private int price;
	private String category;

	public Product(int pid, String pname, int price, String category) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.category = category;
	}
	public Product( String pname, int price, String category) {
		super();
		this.pname = pname;
		this.price = price;
		this.category = category;
	}

	public Product() {

	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
