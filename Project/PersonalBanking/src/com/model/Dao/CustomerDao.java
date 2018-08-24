package com.model.Dao;

import java.util.List;

import com.model.pojo.Customer;

public interface CustomerDao extends BaseDao{
	public List<Customer> getAllCustomers();
	public Customer createCustomer(int applicationId,String userid);
}
