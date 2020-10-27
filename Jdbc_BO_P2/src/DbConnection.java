import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DbConnection {
	public Connection getConnection() {
		Connection con = null;
		ResourceBundle bundle = ResourceBundle.getBundle("mysql");
		String url = bundle.getString("db.url");
		String  user = bundle.getString("db.username");
		String password = bundle.getString("db.password");
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return con;
		
	}

}
