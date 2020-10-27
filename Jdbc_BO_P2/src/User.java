import java.util.Date;

public class User {
	private long id;
	private String name;
	private String username;
	private String password;
	private String role;
	private Date enrolled_date;

	public User(long id, String name, String username, String password, String role, Date enrolled_date) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.role = role;
		this.enrolled_date = enrolled_date;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getEnrolled_date() {
		return enrolled_date;
	}

	public void setEnrolled_date(Date enrolled_date) {
		this.enrolled_date = enrolled_date;
	}

}
