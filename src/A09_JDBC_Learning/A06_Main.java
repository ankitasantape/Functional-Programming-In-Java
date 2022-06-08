package A09_JDBC_Learning;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import A09_JDBC_Learning.A05_ConnectionProvider.ConnectionProvider;


public class A06_Main {
	
	public class Main {
		public static void main(String[] args) {

			try {

				Connection con = ConnectionProvider.getConnection();

				// create a query
				String q = "insert into images(pic) values(?)";

				// get the PreparedStatement object
				PreparedStatement pstmt = con.prepareStatement(q);

				// this is the component of swing which will provide dialogue box to choose file
				JFileChooser jfc = new JFileChooser();

				// we are passing null that means it show us dialogue box at center
				jfc.showOpenDialog(null);

				File file = jfc.getSelectedFile();

				FileInputStream fis = new FileInputStream(file);

				pstmt.setBinaryStream(1, fis, fis.available());

				pstmt.executeUpdate();

				JOptionPane.showMessageDialog(null, "Success");

				con.close();

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}
}

