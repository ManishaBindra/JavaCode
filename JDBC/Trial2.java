package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Trial2 {

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
			
			//step 3 Create a query 
			String q = "create table jdbc(id int primary key auto_increment, name varchar(55) not null , city varchar(300))";
			//create a statement 
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table created in databse");
			
			con.close();

			
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

