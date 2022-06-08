package A09_JDBC_Learning;

import java.sql.*;

public class A03_InsertJDBC {

	public static void main(String[] args) {
		try {
			// load the driver :
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating a connection
			
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username = "root";
			String password = "root";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			// create a query
			String q = "insert into table1(tName, tCity) values (?,?)";
			
			// get the PreparedStatement object
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// set the values to query
			
			pstmt.setString(1, "Ankita Santape");
			pstmt.setString(2, "Nagpur");
			
			pstmt.executeUpdate();
			
			System.out.println("Inserted...");
			
			con.close();
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
