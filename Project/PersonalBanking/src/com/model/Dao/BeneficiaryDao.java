package com.model.Dao;

import java.util.List;

import com.model.pojo.Beneficiary;

public interface BeneficiaryDao extends BaseDao{
	public String getToBank(long accountno);
	public List<Beneficiary> getAllBeneficiaries();
	public void insertBeneficiary(int customerID, long bAccountNo,String bName,String bBankName,String bBankIfsc);
}
