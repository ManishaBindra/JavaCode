package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Trail3 {

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
		
			//Step 3 Create Query
			String q = "insert into jdbc(name,city) values(?,?)";
			
			//get the PreparedStatement OBJ 
			 PreparedStatement pstmt= con.prepareStatement(q);
			 
			 //Set the values to query 
			 //pstmt.setString(1, "Manisha");
			 //pstmt.setString(2, "YNR");
			 
			 pstmt.setString(1, "Shivam");
			 pstmt.setString(2, "CHD");
			 
			 pstmt.executeUpdate();
				System.out.println("inserted");
				
				con.close();
 
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
