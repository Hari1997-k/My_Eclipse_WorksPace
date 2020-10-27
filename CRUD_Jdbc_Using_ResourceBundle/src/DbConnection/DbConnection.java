package DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DbConnection {
	
	ResourceBundle bundle = ResourceBundle.getBundle("mysql");
	String url 		 = bundle.getString("url");
	String driver	 = bundle.getString("driver");
	String user		 = bundle.getString("user");
	String password  = bundle.getString("password");
	Connection con = null;
	
	public Connection getConnection () {
	
	try {
		
		Class.forName(driver);
		con = DriverManager.getConnection(url , user , password);
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
	
	}
}
