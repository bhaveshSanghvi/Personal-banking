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
public class CustomerDaoImpl extends BaseDaoImpl implements CustomerDao{
	List<Customer> customers;
	/* Connection conn;
	Statement s;
	PreparedStatement ps;
	ResultSet rs;*/
	
	public CustomerDaoImpl() {}
	public CustomerDaoImpl(String username) {
		try {
			customers = new ArrayList<Customer>();
		
			/*DriverManager.registerDriver(new OracleDriver());
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","syste","Newuser123");
			s=conn.createStatement();*/
			rs=s.executeQuery("select * from Customer where UserId='"+username+"'");
			System.out.println("=>>>select query fired..."+rs);
			if(rs.next()) {
				System.out.println("=>>>inside rs"+rs);
				Customer c = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6) , rs.getString(7) ,rs.getString(8), rs.getString(9));
				customers.add(c);
				System.out.println("=>>>added..."+rs);
			}
			else{
				System.out.println("user not found");
			}
 		} catch (SQLException e) {
			e.printStackTrace();
		}
		 catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	/*public static CustomerDao getInstance(String username) {
		if(ref==null) {
			ref = new CustomerDaoImpl(username);
			return ref;
		}
		return ref;
	}
*/
	public List<Customer> getAllCustomers() {
		return customers;
	}
	
	public Customer createCustomer(int applicationId,String userid) {
		Customer c=null;
		Address a = null;
		try {
			System.out.println("customer creation started");
			rs = s.executeQuery("select * from Application where ApplicantId="+applicationId);
			if(rs.next()){
				c = new Customer();
				a = new Address();
				System.out.println("customer creation started");
				rs.getInt(1);
				c.setCustomerName(rs.getString(2));
				c.setDateOfBirth(rs.getString(3));
				c.setGender(rs.getString(4));
				c.setEmailId(rs.getString(5));
				System.out.println("customer creation started");
				rs.getLong(6);
				System.out.println("customer creation started");
				rs.getLong(7);
				rs.getLong(8); 
				rs.getLong(9);
				a.setStreet(rs.getString(10));
				a.setCity(rs.getString(11));
				a.setState(rs.getString(12));
				rs.getInt(13);
				s.executeQuery("insert into User1 values(username.nextVal,'user123','user')");
				s.executeQuery("insert into Customer values (customerID.nextVal,'"+userid+"','"+rs.getString(2)+"','"+rs.getString(3)+"','"+rs.getString(4)+"','"+rs.getString(5)+"','"+String.valueOf(rs.getLong(6))+"','"+String.valueOf(rs.getLong(7))+"','"+String.valueOf(rs.getLong(8))+"')");
				System.out.println("customer created");
				int customerid = 0;
				ResultSet rs1 = s.executeQuery("select CUSTOMERID from Customer where USERID ='"+userid+"'");
				if(rs1.next()) {
					customerid = rs1.getInt(1);
				}
				
				s.executeQuery("insert into Account values(AccountID.nextVal,'"+customerid+"',"+0+",'savings','1001','active')");
				
				System.out.println("customer id: "+customerid);
			}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
}