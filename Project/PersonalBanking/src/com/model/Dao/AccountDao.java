package com.model.Dao;

import java.util.List;

import com.model.pojo.Account;

public interface AccountDao extends BaseDao{
	public List<Account> getAllAccounts();
	public double getBalance(long accountno);
	public boolean checkAccount(long accountNo);
}
