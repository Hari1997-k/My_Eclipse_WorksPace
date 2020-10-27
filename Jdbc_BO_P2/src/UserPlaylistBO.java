import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserPlaylistBO {
	public List<UserPlaylist>  getPlaylists(User user){
		DbConnection con = new DbConnection();
		List<UserPlaylist> uplist = null;
		try {
			
			PreparedStatement pst = con.getConnection().prepareCall("select * from playlist");
			ResultSet rs= pst.executeQuery();
			while(rs.next()){
				UserPlaylist up = new UserPlaylist();
				Playlist pp = new Playlist();
				uplist = new ArrayList<UserPlaylist>();
				pp.setId(rs.getInt(1));
				pp.setName(rs.getString(2));
				pp.setCreated_Date(rs.getDate(3));
				up.setPlaylist(pp);
				uplist.add(up);
			}
			System.out.println(uplist.size());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return uplist ;
		
	}

}
