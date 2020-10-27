import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrackDAO {
	public List<Track> getAllTrack(){
		DbConnection con = new DbConnection();
		List<Track> alist = null ;
		try {
			
			PreparedStatement pst  = con.getConnection().prepareStatement("select * from track");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				alist = new ArrayList<Track>();
				Track tr = new Track();
				tr.setDuration(rs.getTime(5));
				tr.setId(rs.getInt(1));
				tr.setFile_url(rs.getString(6));
				tr.setGenre(rs.getString(3));
				tr.setLanguage(rs.getString(4));
				tr.setName(rs.getString(2));
				alist.add(tr);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return alist ;
		
		
	}
	
	public List<Track> getTracks (UserPlaylist playlist) {
	DbConnection con = new DbConnection();
	List<Track> tlist = null;
	Track tt = null;
	
		try {
			PreparedStatement pst = con.getConnection().prepareStatement
					("select * from track  t join playlist p on t.id = p.id join track_playlist tp on t.id = tp.track_id");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
	tlist = new ArrayList<Track>();
		tt = new Track();
			tt.setDuration(rs.getTime(5));
			tt.setFile_url(rs.getString(6));
			tt.setGenre(rs.getString(3));
			tt.setLanguage(rs.getString(4));
			tt.setId(rs.getInt(1));
			tt.setName(rs.getString(2));
	Playlist pp = new Playlist();
			pp.setCreated_Date(rs.getDate(9));
			pp.setId(rs.getInt(7));
			pp.setName(rs.getString(8));
			
		tlist.add(tt);	
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tlist;
		
	}

}
