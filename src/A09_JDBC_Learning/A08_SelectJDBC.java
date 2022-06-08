package A09_JDBC_Learning;

import java.sql.*;

import A09_JDBC_Learning.A05_ConnectionProvider.ConnectionProvider;

public class A08_SelectJDBC {

	public static void main(String[] args) {
		
       try {
			
			Connection con = ConnectionProvider.getConnection();
			
			String query = "select * from table1";
			
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery(query);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2); // add column number
				String city = set.getString(3);
				
				System.out.println(id + " : " + name + " : " + city);
				
			}
        }
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
