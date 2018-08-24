package com.model.DaoImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Dao.*;
import com.model.pojo.*;
public class BeneficiaryDaoImpl extends BaseDaoImpl implements BeneficiaryDao{
	List<Beneficiary> beneficiaries;
	
	static BeneficiaryDaoImpl ref=null;
	public BeneficiaryDaoImpl(){}
	public BeneficiaryDaoImpl(int customerId) {
		try {
			beneficiaries = new ArrayList<Beneficiary>();
			rs=s.executeQuery("select * from Beneficiary where customerID="+customerId);
			while(rs.next()) {
				Beneficiary b = new Beneficiary(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
				beneficiaries.add(b);
				
			}
 		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*public static BeneficiaryDaoImpl getInstance(int customerId) {
		if(ref==null) {
			ref = new BeneficiaryDaoImpl(customerId);
			return ref;
		}
		return ref;
	}*/

	public List<Beneficiary> getAllBeneficiaries() {
		return beneficiaries;
	}
	
	public void insertBeneficiary(int customerID,long bAccountNo,String bName,String bBankName,String bBankIfsc) {
		try {
			/*Beneficiary b =null;
			ps=conn.prepareStatement("insert into Beneficiary values(?,?,?,?,?)");
			ps.setInt(1, customerID);
			ps.setLong(2, bAccountNo);
			ps.setString(3, bName);
			ps.setString(4, bBankName);
			ps.setString(5, bBankIfsc);
			ps.executeUpdate();
			b = new Beneficiary(customerID,bAccountNo, bName, bBankName, bBankIfsc);
			beneficiaries.add(b);*/
			
			s.executeQuery("insert into Beneficiary values("+bAccountNo+",'"+bName+"','"+bBankName+"','"+bBankIfsc+"',"+customerID+")");
			System.out.println("inserted");
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String getToBank(long accountno) {
		try {
			rs = s.executeQuery("select BENEFICIARYBANKNAME from Beneficiary where BENEFICIARYACCOUNTNO="+accountno);
			if(rs.next()) {
				closeConnection();
				return rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "null";
	}

}
