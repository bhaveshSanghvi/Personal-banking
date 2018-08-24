package com.model.DaoImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Dao.*;
import com.model.pojo.*;
public class ForgotLoginDaoImpl extends BaseDaoImpl implements ForgotLoginDao {
List<ForgotLogin> forgets;
	
	/*static ForgotLoginDaoImpl ref=null;
	public ForgotLoginDaoImpl(String emailid) {
		try {
			forgets= new ArrayList<ForgotLogin>();
			rs=s.executeQuery("select * from forgotlogin where EMAILID='"+emailid+"'");
			while(rs.next()) {
				
		
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

	public List<ForgotLogin> getAllDebitCards() {
		return forgets;
	}*/
	public ForgotLoginDaoImpl() {
		
	}
	
	public String checkEmail(String emailid) {
		try {
			rs = s.executeQuery("select userID from Customer where CUSTOMEREMAILID="+emailid);
			if(rs.next()) {
				return rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "null";
	}
	
}
