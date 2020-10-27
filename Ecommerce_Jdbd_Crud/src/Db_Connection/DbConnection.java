package Db_Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DbConnection {
	public static Connection GetConnection() {
		String url = "jdbc:mysql://localhost:3306/ecommerce";
		String user = "root";
		String password = "";
		Connection Con = null ;
				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 Con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return Con;
		
		
	}

}
