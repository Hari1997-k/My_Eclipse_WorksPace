import java.util.Date;

public class Playlist {

	private long id;
	private String name;
	private Date Created_Date;

	public Playlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Playlist(long id, String name, Date created_Date) {
		super();
		this.id = id;
		this.name = name;
		Created_Date = created_Date;
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

	public Date getCreated_Date() {
		return Created_Date;
	}

	public void setCreated_Date(Date created_Date) {
		Created_Date = created_Date;
	}

}
