import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("dd-MM-yyyy");
		UserDAO udao = new  UserDAO();
		User u = udao.getUser("admin");
		//FORMATTING DATE OBJECT BY CONVERTING INTO STRING
		String edate = sdf.format(u.getEnrolled_date());

		System.out.println("GET USER_DETAILS BY  USERNAME :\n");
		System.out.println("WELCOME "+ u.getName()+"\n");
		System.out.println(u.getId()+"\t"+u.getUsername()+"\t"+u.getPassword()+"\t"+u.getRole()+"\t"+edate);
		
		System.out.println("=========================================================================");
		TrackDAO tdao = new TrackDAO();
		sdf.applyPattern("mm:ss");
		List<Track> tlist = tdao.getAllTrack();
		Date tym = null;
		for(Track tt : tlist) {
			//HERE WE ARE FORMATING TIME BY CONVERTING TIME INTO DATE, AND THEN FORMATING the converted  DATE WHICH WII GIVES THE FORMATED TYM
			tym = tt.getDuration();
			String duration = sdf.format(tym);
			System.out.println(tt.getId()+"\t\t"+tt.getName()+"\t\t"+tt.getLanguage()+"\t\t"+tt.getGenre()+"\t\t"+duration+"\t\t"+tt.getFile_url());
			System.out.println("============================================================================");

		}
		
		UserPlaylist plist = new UserPlaylist();
		List<Track> tlist1 = tdao.getTracks(plist);
		for(Track t1 : tlist1) {
		System.out.println(t1);
		}
		
		
		UserPlaylistBO ubo = new UserPlaylistBO();
		User u1 = new User();
		List<UserPlaylist> uplst = ubo.getPlaylists(u1);
		System.out.println("FETCHING PLAYLIST FROM USERPLAYLIST ");
		for(UserPlaylist upp : uplst) {
			System.out.println(uplst.size());
			System.out.println(upp.getPlaylist().getId()+"\t"+upp.getPlaylist().getName()+"\t"+upp.getPlaylist().getCreated_Date());
		}
		
	}

}
