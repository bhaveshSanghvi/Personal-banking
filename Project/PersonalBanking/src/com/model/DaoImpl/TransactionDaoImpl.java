package com.model.DaoImpl;
import com.model.Dao.*;
import com.model.pojo.*;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class TransactionDaoImpl extends BaseDaoImpl implements TransactionDao {
		List<Transaction> transactions;
		
		//static TransactionDaoImpl ref=null;
		public TransactionDaoImpl(){}
		public TransactionDaoImpl(long a){
			System.out.println("inside constructor");
			try {
				transactions = new ArrayList<Transaction>();
				rs=s.executeQuery("select * from Transaction where FROMACCOUNTNO="+a+" or TOACCOUNTNO="+a+" order by TransactionID desc");
				while(rs.next()) {
					Transaction t = new Transaction(rs.getInt(1), rs.getLong(2),rs.getLong(3),rs.getString(4),rs.getString(5),rs.getDouble(6),rs.getString(7));
					transactions.add(t);
				}
	 		} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		/*public static TransactionDaoImpl getInstance() {
			if(ref==null) {
				ref = new TransactionDaoImpl();
				return ref;
			}
			return ref;
		}*/

		public List<Transaction> getAllTransactions() {
			return transactions;
		}
		
		
		public void insertTransaction(long fromAccountNo,long toAccountNo,String fromBank,String toBank,double amount) {
			try {
				int max=0;
				DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
				Date today = Calendar.getInstance().getTime();
				String datetime = df.format(today);	
				Transaction t =null;
				System.out.println(datetime);
				System.out.println("nfnrif");
				/*ps=conn.prepareStatement("insert into Transaction values(TransactionID.nextVal,?,?,?,?,?)");
				System.out.println("nfnrif");
				ps.setLong(2, fromAccountNo);
				System.out.println("nfnrif");
				ps.setLong(3, toAccountNo);System.out.println("nfnrif");
				ps.setString(4, fromBank);System.out.println("nfnrif");
				ps.setString(5, toBank);System.out.println("nfnrif");
				ps.setDouble(6, amount);System.out.println("yoyo");
				//ps.setString(7, datetime);System.out.println("yoyo");
				ps.executeUpdate();System.out.println("yoyo");*/
				s.executeQuery("insert into Transaction values(TransactionID.nextVal,"+fromAccountNo+","+toAccountNo+",'"+fromBank+"','"+toBank+"',"+amount+",'"+datetime+"')");
				/*
rs = s.executeQuery("select max(TransactionID) from Transaction");
				
				if(rs.next())
					 max = rs.getInt(1);*/
				/*t = new Transaction(max, fromAccountNo, toAccountNo, fromBank, toBank, amount, datetime);
				transactions.add(t);*/
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		/*
		public void deleteTransaction(int transactionID) {
			try {
				ps=conn.prepareStatement("delete from Transaction where transactionID="+transactionID);
				transactions.remove(requestId);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}*/
		
}
