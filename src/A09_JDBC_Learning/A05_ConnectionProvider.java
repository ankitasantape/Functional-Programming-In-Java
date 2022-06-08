package A09_JDBC_Learning;

import java.io.*;
import java.sql.*;

import javax.swing.*;

public class A05_ConnectionProvider {

	public class ConnectionProvider {

		private static Connection con;

		public static Connection getConnection() {

			try {

				if (con == null) {

					Class.forName("com.mysql.cj.jdbc.Driver");

					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "root");
				}

			} catch (Exception e) {

				e.printStackTrace();
			}

			return con;
		}
	}
}
