package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Trail1 {

	public static void main(String[] args) {
		try {
		//step1 Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is Loaded");
		
		//step 2 Creating the connection 
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "password";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		if(con.isClosed()) {
			System.out.println("Connection is closed");	
		}
		else {
			System.out.println("Connection created");
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
