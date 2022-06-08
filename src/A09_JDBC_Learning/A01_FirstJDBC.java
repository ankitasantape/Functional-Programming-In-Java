package A09_JDBC_Learning;

import java.sql.*;

public class A01_FirstJDBC {

	public static void main(String[] args) {
		
		try {
			// load the driver :
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating a connection
			
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username = "root";
			String password = "root";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
//			if(con.isClosed()) {
//				System.out.println("Connection is Closed!");
//			}
//			else {
//			    System.out.println("Connection Created....");	
//			}
			
			
			// create a query
			
			String q = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
			
			// create a statement:
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate(q);
			
			System.out.println("table created in database..");
			
			con.close();
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
