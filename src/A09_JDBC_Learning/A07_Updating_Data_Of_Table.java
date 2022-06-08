package A09_JDBC_Learning;

import java.sql.*;
import java.io.*;

import A09_JDBC_Learning.A05_ConnectionProvider.ConnectionProvider;

public class A07_Updating_Data_Of_Table {

	public static void main(String[] args) {
		
		try {
			
			Connection con = ConnectionProvider.getConnection();
			
			String q = "update table1 set tName=?, tCity=? where tId=?";
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter new name : ");
			String name = br.readLine();
			
			System.out.println("Enter new city name : ");
			String city = br.readLine();
			
			System.out.println("Enter the student id : ");
			int id = Integer.parseInt(br.readLine());
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			
			pstmt.setInt(3, id);
			
			pstmt.executeUpdate();
			
			System.out.println();
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
