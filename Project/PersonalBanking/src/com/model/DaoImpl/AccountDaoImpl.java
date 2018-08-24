package com.model.DaoImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Dao.*;
import com.model.pojo.*;
import com.model.users.*;;
public class AccountDaoImpl extends BaseDaoImpl implements AccountDao,SenderInterface,ReceiverInterface {
List<Account> accounts;
	
	//static AccountDaoImpl ref=null;
	public AccountDaoImpl(int customerID) {
		try {
			accounts = new ArrayList<Account>();
			rs=s.executeQuery("select * from Account where customerId="+customerID);
			while(rs.next()) {
				Account a = new Account(rs.getLong(1),rs.getInt(2),rs.getDouble(3),rs.getString(4),rs.getString(5),rs.getString(6));
				accounts.add(a);
			}
 		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public AccountDaoImpl() {}
	
	/*public static AccountDao getInstance(int customerID) {
		if(ref==null) {
			ref = new AccountDaoImpl(customerID);
			return ref;
		}
		return ref;
	}
*/
	public List<Account> getAllAccounts() {
		return accounts;
	}
	
	public void createAccount(long accountNo, int customerID, double balance,String type, String ifsc,String status) {
		try {
			Account t =null;
			ps=conn.prepareStatement("insert into Account values(?,?,?,?,?,?)");
			ps.setLong(1, accountNo);
			ps.setInt(2, customerID);
			ps.setDouble(3, balance);
			ps.setString(4,type);
			ps.setString(5, ifsc);
			ps.setString(5, status);
			ps.executeUpdate();
			t = new Account(accountNo, customerID, balance, type, ifsc,status);
			accounts.add(t);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteAccount(int accountNo) {
		try {
			ps=conn.prepareStatement("delete from Account where accountNumber="+accountNo);
			accounts.remove(accountNo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public double getBalance(long accountno) {
		double balance=0;
		try {
			rs=s.executeQuery("select AccountBalance from Account where AccountNo = "+accountno);
			if(rs.next()) {
				return rs.getDouble(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection();
		return balance;
	}
	
	public void withdrawAmount(long accountNo,double amount) {
		try {
			ps=conn.prepareStatement("update Account set AccountBalance=AccountBalance-"+amount+" where AccountNo="+accountNo);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void DepositAmount(long accountNo,double amount) {
		try {
			ps=conn.prepareStatement("update Account set AccountBalance=AccountBalance+"+amount+" where AccountNo="+accountNo);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean checkAccount(long accountNo) {
		try {
			rs=s.executeQuery("select * from Account where AccountNo ="+accountNo);
			if(rs.next()) {
				return true;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}
}
