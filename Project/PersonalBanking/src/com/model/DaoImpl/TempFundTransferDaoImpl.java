package com.model.DaoImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.model.Dao.*;
import com.model.pojo.*;

public class TempFundTransferDaoImpl extends BaseDaoImpl implements TempFundTransferDao {
	List<TempFundTransfer> transfers;
	
	static TempFundTransferDaoImpl ref=null;
	public TempFundTransferDaoImpl() {
		try {
			transfers = new ArrayList<TempFundTransfer>();
			rs=s.executeQuery("select * from TempFundTransfer");
			while(rs.next()) {
				TempFundTransfer t = new TempFundTransfer(rs.getInt(1), rs.getLong(2),rs.getLong(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getString(7));
				transfers.add(t);
			}
 		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*public static TempFundTransferDao getInstance() {
		if(ref==null) {
			ref = new TempFundTransferDaoImpl();
			return ref;
		}
		return ref;
	}*/

	public List<TempFundTransfer> getAllTempFundTransfer() {
		return transfers;
	}
	
	public void insertTempFundTransfer(int requestId,long fromAccountNo,long toAccountNo,String fromBank,String toBank,double amount,String dateTime) {
		try {
			TempFundTransfer t =null;
			ps=conn.prepareStatement("insert into TempFundTransfer values(FundTransferRequestID.nextVal,?,?,?,?,?,?)");
			ps.setLong(2, fromAccountNo);
			ps.setLong(3, toAccountNo);
			ps.setString(4, fromBank);
			ps.setString(5, toBank);
			ps.setDouble(6, amount);
			ps.setString(7,dateTime);
			ps.executeUpdate();
			t = new TempFundTransfer(requestId, fromAccountNo, toAccountNo, fromBank, toBank, amount, dateTime);
			transfers.add(t);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteTempFundTransfer(int requestId) {
		try {
			ps=conn.prepareStatement("delete from TempFundTransfer where requestId="+requestId);
			transfers.remove(requestId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
