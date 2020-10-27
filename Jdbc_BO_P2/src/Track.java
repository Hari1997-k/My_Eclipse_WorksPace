import java.util.Date;

public class Track {
	private long id;
	private String name;
	private String genre;
	private String language;
	private Date duration;
	private String file_url;

	public Track() {

	}

	public Track(long id, String name, String genre, String language, Date duration, String file_url) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.language = language;
		this.duration = duration;
		this.file_url = file_url;
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	public String getFile_url() {
		return file_url;
	}

	public void setFile_url(String file_url) {
		this.file_url = file_url;
	}

}
