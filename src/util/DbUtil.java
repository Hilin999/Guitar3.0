package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	
	static Connection conn=null;
	public static Connection getConnection(String choice) throws Exception{
	
		if (choice.equals("sqlite")) {
			Class.forName("org.sqlite.JDBC");
		    conn = DriverManager.getConnection("jdbc:sqlite:db/inventory.db");	
		}else if (choice.equals("mysql")){
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "123456");	
		}
	return conn;
	
	}
  
}
