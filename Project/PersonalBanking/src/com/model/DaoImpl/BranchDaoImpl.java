package com.model.DaoImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Dao.*;
import com.model.pojo.*;
import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

import java.util.*;
public class BranchDaoImpl extends BaseDaoImpl implements BranchDao {
List<Branch> branches;
	
	public BranchDaoImpl() {
		try {
			branches = new ArrayList<Branch>();
			rs=s.executeQuery("select * from Branch");
			while(rs.next()) {
				Branch t = new Branch(rs.getString(1), rs.getString(2),rs.getString(3));
				branches.add(t);
			}
 		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Branch> getAllBranches() {
		return branches;
	}
	
	public boolean searchBranchIfsc(String ifsc) {
		try {
			rs = s.executeQuery("select * from Branch where BRANCHIFSC='"+ifsc+"'");
			if(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
