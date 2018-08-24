package com.model.pojo;

public class Customer {
	int customerId;
	String userId;
	String customerName;
	String dateOfBirth;
	String gender;
	String emailId;
	String AadharCardNo;
	String PanCardNo;
	String MobileNo;
	public Customer() {}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAadharCardNo() {
		return AadharCardNo;
	}
	public void setAadharCardNo(String aadharCardNo) {
		AadharCardNo = aadharCardNo;
	}
	public String getPanCardNo() {
		return PanCardNo;
	}
	public void setPanCardNo(String panCardNo) {
		PanCardNo = panCardNo;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public Customer(int customerId, String userId, String customerName,
			String dateOfBirth, String gender, String emailId,
			String aadharCardNo, String panCardNo, String mobileNo) {
		super();
		this.customerId = customerId;
		this.userId = userId;
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.emailId = emailId;
		AadharCardNo = aadharCardNo;
		PanCardNo = panCardNo;
		MobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", userId=" + userId
				+ ", customerName=" + customerName + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", emailId=" + emailId
				+ ", AadharCardNo=" + AadharCardNo + ", PanCardNo=" + PanCardNo
				+ ", MobileNo=" + MobileNo + "]";
	}
}
