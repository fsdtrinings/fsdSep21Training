package jdbc.db;

import java.sql.Connection;
import java.sql.DriverManager;

// Database connection class
public class DBConfig {

	public static Connection con;
	
	static String host = "localhost:3306";
	static String database = "Rapipay";
	static String url = "jdbc:mysql://"+ host+"/"+database;
	static 
	{
		try {
			
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection(url,"root","root");
		    System.out.println("con "+con);
		    
		} catch (Exception e) {
			System.out.println("NOTE:-  Exception at DBConfig "+e);
		}
		
	}
}





