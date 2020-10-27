import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	public User getUser(String username) {
		
		DbConnection con = new DbConnection();
		User user = null ;
		try {
			PreparedStatement pst = con.getConnection().prepareStatement("select * from user where username = ?");
			pst.setString(1 , username);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
			user = new User();
			user.setUsername(rs.getString(3));
			user.setId(rs.getInt(1));
			user.setName(rs.getString(2));
			user.setPassword(rs.getString(4));
			user.setRole(rs.getString(5));
			user.setEnrolled_date(rs.getDate(6));
					}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
		
		
	}
}
