package com.model.DaoImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Dao.*;
import com.model.pojo.*;
public class DebitCardApplicationDaoImpl extends BaseDaoImpl implements DebitCardApplicationDao{
List<DebitCardApplication> debitcards;
	
	static DebitCardApplicationDaoImpl ref=null;
	private DebitCardApplicationDaoImpl() {
		try {
			debitcards = new ArrayList<DebitCardApplication>();
			rs=s.executeQuery("select * from DebitCardApplication");
			while(rs.next()) {
				DebitCardApplication t = new DebitCardApplication(rs.getInt(1),rs.getLong(2));
				debitcards.add(t);
			}
 		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DebitCardApplicationDao getInstance() {
		if(ref==null) {
			ref = new DebitCardApplicationDaoImpl();
			return ref;
		}
		return ref;
	}

	public List<DebitCardApplication> getAllDebitCardApplications() {
		return debitcards;
	}
	
	public void insertDebitCardApplication(int requestID,long accountNo) {
		try {
			DebitCardApplication t =null;
			ps=conn.prepareStatement("insert into AccountDeletion values(?,?,?)");
			ps.setInt(1,requestID);
			ps.setLong(2, accountNo);
			ps.executeUpdate();
			t = new DebitCardApplication(requestID, accountNo);
			debitcards.add(t);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteDebitCardRequest(int requestId) {
		try {
			ps=conn.prepareStatement("delete from DebitCardApplication where requestId="+requestId);
			debitcards.remove(requestId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
