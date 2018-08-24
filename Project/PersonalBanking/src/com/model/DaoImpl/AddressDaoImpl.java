package com.model.DaoImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Dao.*;
import com.model.pojo.*;
public class AddressDaoImpl extends BaseDaoImpl implements AddressDao{
List<Address> addresses;
	
	public AddressDaoImpl(){}
	public AddressDaoImpl(int customerId) {
		try {
			addresses = new ArrayList<Address>();
			rs=s.executeQuery("select * from Address where customerID="+customerId);
			while(rs.next()) {
				Address b = new Address(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
				addresses.add(b);
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

	public List<Address> getAllAddress() {
		return addresses;
	}
	
	/*public void insertBeneficiary(int customerID,long bAccountNo,String bName,String bBankName,String bBankIfsc) {
		try {
			Beneficiary b =null;
			ps=conn.prepareStatement("insert into Beneficiary values(?,?,?,?,?)");
			ps.setInt(1, customerID);
			ps.setLong(2, bAccountNo);
			ps.setString(3, bName);
			ps.setString(4, bBankName);
			ps.setString(5, bBankIfsc);
			ps.executeUpdate();
			b = new Beneficiary(customerID,bAccountNo, bName, bBankName, bBankIfsc);
			beneficiaries.add(b);
			
			s.executeQuery("insert into Beneficiary values("+bAccountNo+",'"+bName+"','"+bBankName+"','"+bBankIfsc+"',"+customerID+")");
			System.out.println("inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}*/
	
	

}
