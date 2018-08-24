package com.model.Dao;

import java.util.List;

import com.model.pojo.Application;

public interface ApplicationDao extends BaseDao{
	public Application getApplication(int applicationId);
	public List<Application> getAllApplications();
	public void insertApplication(String applicantName,String applicantDOB, String applicantGender, String emailId,long aadharCardNo,long panCardNo,long mobileNo,long flatNo, String street, String city, String state, int pin);
}
