package com.model.DaoImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Dao.*;
import com.model.pojo.*;
public class AccountDeletionDaoImpl extends BaseDaoImpl implements AccountDeletionDao {
List<AccountDeletion> accounts;
	
	static AccountDeletionDaoImpl ref=null;
	private AccountDeletionDaoImpl() {
		try {
			accounts = new ArrayList<AccountDeletion>();
			rs=s.executeQuery("select * from AccountDeletion");
			while(rs.next()) {
				AccountDeletion t = new AccountDeletion(rs.getInt(1), rs.getLong(2), rs.getInt(3));
				accounts.add(t);
			}
 		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static AccountDeletionDao getInstance() {
		if(ref==null) {
			ref = new AccountDeletionDaoImpl();
			return ref;
		}
		return ref;
	}

	public List<AccountDeletion> getAllAccountDeletion() {
		return accounts;
	}
	
	public void insertAccountDeletionRequest(int requestID,long accountNo,int customerID) {
		try {
			AccountDeletion t =null;
			ps=conn.prepareStatement("insert into AccountDeletion values(?,?,?)");
			ps.setInt(1,requestID);
			ps.setLong(2, accountNo);
			ps.setInt(3,customerID );
			ps.executeUpdate();
			t = new AccountDeletion(requestID, accountNo, customerID);
			accounts.add(t);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteAccountRequest(int requestId) {
		try {
			ps=conn.prepareStatement("delete from AccountDeletion where requestId="+requestId);
			accounts.remove(requestId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
