package ExceptionHandling;


import java.sql.*;
public class Example4_CNFE {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://127.0.0.1:3307/deeptech";
		String user = "root";
		String password = "root";

		try
		{
			// Load the Connector/J driver
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// Establish connection to MySQL
			Connection conn = DriverManager.getConnection(url, user, password);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
