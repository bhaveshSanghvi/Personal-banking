package com.model.Dao;

import java.util.List;

import com.model.pojo.Transaction;

public interface TransactionDao extends BaseDao{
	public List<Transaction> getAllTransactions();
	public void insertTransaction(long fromAccountNo,long toAccountNo,String fromBank,String toBank,double amount); 
}
