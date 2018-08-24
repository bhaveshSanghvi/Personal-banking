package com.model.DaoImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

import com.model.Dao.*;
import com.model.pojo.*;
public class ApplicationDaoImpl extends BaseDaoImpl implements ApplicationDao{
	List<Application> applications;
	/*Connection conn;
	Statement s;
	PreparedStatement ps;
	ResultSet rs;*/
	
	static ApplicationDaoImpl ref=null;
	public ApplicationDaoImpl() {
		try {
			applications = new ArrayList<Application>();
			/*DriverManager.registerDriver(new OracleDriver());
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","syste","Newuser123");
			s=conn.createStatement();
	*/		rs=s.executeQuery("select * from Application");
			while(rs.next()) {
				Application a = new Application(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getLong(6),rs.getLong(7),rs.getLong(8),rs.getLong(9),rs.getString(10),rs.getString(11), rs.getString(12), rs.getInt(13));
				applications.add(a);
			}
 		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*public static ApplicationDao getInstance() {
		if(ref==null) {
			ref = new ApplicationDaoImpl();
			return ref;
		}
		return ref;
	}*/
	
	public List<Application> getAllApplications() {
		return applications;
	}
	
	public Application getApplication(int applicationId) {
			Application u = null;
			try {
				rs=s.executeQuery("select * from Application where ApplicantID ="+applicationId);
				if(rs.next()) {
					u = new Application(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getLong(6),rs.getLong(7),rs.getLong(8),rs.getLong(9),rs.getString(10),rs.getString(11), rs.getString(12), rs.getInt(13));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			closeConnection();
			return u;
	}
	public void insertApplication(String applicantName,String applicantDOB, String applicantGender, String emailId,long aadharCardNo,long panCardNo,long mobileNo,long flatNo, String street, String city, String state, int pin){
		try {
			System.out.println("inside insert function");
			s.executeQuery("insert into Application values(ApplicantID.nextVal,'"+applicantName+"','"+applicantDOB+"','"+applicantGender+"','"+emailId+"',"+aadharCardNo+","+panCardNo+","+mobileNo+","+flatNo+",'"+street+"','"+city+"','"+state+"',"+pin+")");
			System.out.println("return from insert function");
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleteApplication(int applicationId) {
		try {
			rs=s.executeQuery("delete from Application where applicantId="+applicationId);
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
