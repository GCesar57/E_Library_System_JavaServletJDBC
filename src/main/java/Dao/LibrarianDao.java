package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Beans.LibrarianBean;

public class LibrarianDao {
	public static int save(LibrarianBean bean) {
		int status = 0;
		//int id = 0;
		try {
			Connection con = DB.getCon();
			PreparedStatement ps = con.prepareStatement("insert into e_librarian(id,name,email,password,mobile) values(?,?,?,?,?)");
			ps.setString(1, "1"); //It is supposed to be one librarian only
			ps.setString(2, bean.getName());
			ps.setString(3, bean.getEmail());
			ps.setString(4, bean.getPassword());
			ps.setInt(5, bean.getMobile());
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error saving data: "+e.getMessage());
			System.out.println(e.getStackTrace());
		}
		return status;
	}//
	//
	public static int update(LibrarianBean bean) {
		int status = 0;
		try {
			Connection con = DB.getCon();
			PreparedStatement ps = con.prepareStatement("update e_librarian set name=?,email=?,password=?,mobile=? where id=?");
			ps.setString(1, bean.getName());
			ps.setString(2, bean.getEmail());
			ps.setString(3, bean.getPassword());
			ps.setInt(4, bean.getMobile());
			ps.setInt(5, bean.getId());
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error updating data3: "+e.getMessage());
			System.out.println(e.getStackTrace());
		}
		return status;
	}//
	//
	public static List<LibrarianBean>view(){
		List<LibrarianBean>list = new ArrayList<LibrarianBean>();
		try {
			Connection con = DB.getCon();
			PreparedStatement ps = con.prepareStatement("select * from e_librarian");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				LibrarianBean bean = new LibrarianBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setEmail(rs.getString("email"));
				bean.setPassword(rs.getString("password"));
				bean.setMobile(rs.getInt("mobile"));
				list.add(bean);
			}//
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error updating data2: "+e.getMessage());
			System.out.println(e.getStackTrace());
		}
		return list;
	}//
	public static LibrarianBean viewById(int id) {
		LibrarianBean bean = new LibrarianBean();
		try {
			Connection con = DB.getCon();
			PreparedStatement ps = con.prepareStatement("select * from e_librarian where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				bean.setId(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setPassword(rs.getString(3));
				bean.setEmail(rs.getString(4));
				bean.setMobile(rs.getInt(5));
			}//
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error updating data1: "+e.getMessage());
			System.out.println(e.getStackTrace());
		}
		return bean;
	}//
	//
	public static int delete(int id) {
		int status = 0;
		try {
			Connection con = DB.getCon();
			PreparedStatement ps = con.prepareStatement("delete from e_librarian where id=?");
			ps.setInt(1, status);
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error deleting data: "+e.getMessage());
			System.out.println(e.getStackTrace());
		}
		return status;
	}//
	//
	public static boolean authenticate(String email, String password) {
		boolean status = false;
		try {
			Connection con = DB.getCon();
			PreparedStatement ps = con.prepareStatement("select * from e_librarian where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				status = true;
			}//
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error authenticating data: "+e.getMessage());
			System.out.println(e.getStackTrace());
		}
		return status;
	}//
}
