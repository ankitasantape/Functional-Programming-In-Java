package A09_JDBC_Learning;

import java.sql.*;
import java.io.*;

public class A04_Inserting_Data_To_Table_With_Dynamic_Input {

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
			
			// pass values by bufferReader
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter name : ");
			String name = br.readLine();
			
			System.out.println("Enter city : ");
			String city = br.readLine();
			
			// set the values to query
			
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			
			pstmt.executeUpdate();
			
			System.out.println("Inserted...");
			
			con.close();
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
