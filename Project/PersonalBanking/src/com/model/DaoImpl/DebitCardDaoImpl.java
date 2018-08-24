package com.model.DaoImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Dao.*;
import com.model.pojo.*;
public class DebitCardDaoImpl extends BaseDaoImpl implements DebitCardDao{
List<DebitCard> debitcards;
	
	static DebitCardDaoImpl ref=null;
	private DebitCardDaoImpl() {
		try {
			debitcards = new ArrayList<DebitCard>();
			rs=s.executeQuery("select * from DebitCard");
			while(rs.next()) {
				DebitCard t = new DebitCard(rs.getLong(1), rs.getString(2),rs.getInt(3),rs.getLong(4), rs.getString(5));
				debitcards.add(t);
			}
 		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DebitCardDaoImpl getInstance() {
		if(ref==null) {
			ref = new DebitCardDaoImpl();
			return ref;
		}
		return ref;
	}

	public List<DebitCard> getAllDebitCards() {
		return debitcards;
	}
	
	public void insertDebitCard(long debitCardNumber,String expiryDate,int cvvNO,long accountNumber,String debitCardType) {
		try {
			DebitCard t =null;
			ps=conn.prepareStatement("insert into DebitCard values(?,?,?,?,?)");
			ps.setLong(1, debitCardNumber);
			ps.setString(2,expiryDate);
			ps.setInt(3,cvvNO);
			ps.setLong(4,accountNumber);
			ps.setString(5, debitCardType);
			
			ps.executeUpdate();
			t = new DebitCard(debitCardNumber, expiryDate, cvvNO, accountNumber, debitCardType);
			debitcards.add(t);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*public void deleteDebitCard(int requestId) {
		try {
			ps=conn.prepareStatement("delete from DebitCardApplication where requestId="+requestId);
			debitcards.remove(requestId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}*/
}
