package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;

public class Trail4 {

	public static void main(String[] args) {
		//Another way to add dynamical data 
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
			
			//get the PreparedStatement OBJ <!-- hjjnhhnjjj-->
			 PreparedStatement pstmt= con.prepareStatement(q);
			 
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name : ");
			String name = br.readLine();
			System.out.println("Enter city : ");
			String city = br.readLine();
			
			 pstmt.setString(1, name);
			 pstmt.setString(2, city);
			 
			 pstmt.executeUpdate();
				System.out.println("inserted");
				
				con.close();
 
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
