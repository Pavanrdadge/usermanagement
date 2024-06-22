package com.ty.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.entity.User;

public class UserDao {

	private static final String driver = "org.postgresql.Driver";
	private static final String url = "jdbc:postgresql://localhost:5432/userdatabase";
	private static final String username = "postgres";
	private static final String password = "root";

	public int save(User user) {
		int update = 0;
		try {

			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, username, password);

			String sql = "INSERT INTO usermanage VALUES(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user.getId());
			ps.setString(2, user.getName());
			ps.setInt(3, user.getAge());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getPassword());
			ps.setLong(6, user.getMobileNumber());

			int executeUpdate = ps.executeUpdate();

			if (executeUpdate > 0)
				return update + executeUpdate;

			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return update;
	}

	public boolean updateUserById(User user) {

		boolean flag = false;

		try {

			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);

			String sql = "UPDATE usermanage set name=?,age=?,email=?,password=?,mobilenumber=? WHERE id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setInt(2, user.getAge());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			ps.setLong(5, user.getMobileNumber());

			ps.setInt(6, user.getId());

			int executeUpdate = ps.executeUpdate();
			if (executeUpdate > 0) {
				flag = true;
				return flag;
			}
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;
	}

	public boolean deleteById(int id) {
		boolean flag = false;
		try {

			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			String sql = "Delete from usermanage where id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			int executeUpdate = ps.executeUpdate();
			if (executeUpdate > 0) {
				flag = true;
				return flag;
			}
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;
	}

	public List<User> fetchUserData() {
		ArrayList<User> arrayList = new ArrayList();

		try {

			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			String sql = "SELECT * FROM  usermanage";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String email = rs.getString(4);
				String password = rs.getString(5);
				long mobileNumber = rs.getLong(6);
				arrayList.add(new User(id, name, age, email, password, mobileNumber));
			}

			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return arrayList;	
	}

}
