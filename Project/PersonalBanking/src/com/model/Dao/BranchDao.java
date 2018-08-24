package com.model.Dao;

import java.util.List;

import com.model.pojo.Branch;

public interface BranchDao extends BaseDao{
	public List<Branch> getAllBranches();
	public boolean searchBranchIfsc(String ifsc);
}
