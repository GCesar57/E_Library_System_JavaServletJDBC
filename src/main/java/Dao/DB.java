package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	//Method to connecto to the DB.
	public static Connection getCon() {
		Connection con = null;
		String user = "root";
		String pass = "";
		try {
			//
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_library_system", user, pass);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		return con;
	}//
}
