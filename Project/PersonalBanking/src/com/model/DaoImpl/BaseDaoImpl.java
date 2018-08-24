package com.model.DaoImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

import com.model.Dao.*;
import com.model.pojo.*;
public class BaseDaoImpl implements BaseDao {
	Connection conn;
	Statement s;
	PreparedStatement ps;
	ResultSet rs;
	
	public BaseDaoImpl() {
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn=DriverManager.getConnection("jdbc:oracle:thin:@172.17.111.142:1521:XE","syste","Newuser123");
			s=conn.createStatement();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeConnection() {
		try {
			conn.close();
			s.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			}
}
