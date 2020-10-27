
public class UserPlaylist {
	
	private Playlist playlist ;
	private User user ;
	
	public UserPlaylist() {
		
	}
	
	
	public UserPlaylist(Playlist playlist, User user) {
		super();
		this.playlist = playlist;
		this.user = user;
	}
	
	
	public Playlist getPlaylist() {
		return playlist;
	}
	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
