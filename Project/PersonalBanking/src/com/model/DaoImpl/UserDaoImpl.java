package com.model.DaoImpl;
import com.model.Dao.*;
import com.model.pojo.*;

import java.sql.*;

import java.util.*;
public class UserDaoImpl extends BaseDaoImpl implements UserDao{
	List<User> users;
	/*Connection conn;
	Statement s;
	PreparedStatement ps;
	ResultSet rs;*/
	
	static UserDaoImpl ref=null;
	public UserDaoImpl() {
		//try {
			users = new ArrayList<User>();
			/*DriverManager.registerDriver(new OracleDriver());
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","syste","Newuser123");*/
			//s=conn.createStatement();
			/*rs=s.executeQuery("select * from User1");
			publicwhile(rs.next()) {
				User u = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				users.add(u);
			}*/
			
/* 		} catch (SQLException e) {
			e.printStackTrace();
		}
*/	}
	
	/*public static UserDao getInstance() {
		if(ref==null) {
			ref = new UserDaoImpl();
			return ref;
		}
		return ref;
	}*/
	
	public List<User> getAllUsers() {
		return users;
	}
	
	public User authenticate(String username, String password) {
		User u =null;
		try {
			rs=s.executeQuery("select * from User1 where UserID='"+username+"' and Password='"+password+"'");
			if(rs.next()) {
				u = new User();
				u.setUserId(rs.getString(1));
				u.setPassword(rs.getString(2));
				u.setUserType(rs.getString(3));
			return u;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	public User createUser() {
		User u =null;
		try {
			ps=conn.prepareStatement("insert into User1 values (username.nextVal,'password','user')");
			ps.executeUpdate();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	public void updateLastLogin() {
		
	}
	
	public void getLastLogin() {
		
	}
}
