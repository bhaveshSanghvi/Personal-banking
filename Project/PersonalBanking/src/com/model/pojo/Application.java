package com.model.pojo;

public class Application {
	int ApplicantID;
	String applicantName;
	String applicantDOB;
	String applicantGender;
	String emailId;
	long aadharCardNo;
	long panCardNo;
	long mobileNo;
	long flatNo;
	String street;
	String city;
	String state;
	int pin;
	public Application() {
		
	}
	@Override
	public String toString() {
		return "Application [ApplicantID=" + ApplicantID + ", applicantName="
				+ applicantName + ", applicantDOB=" + applicantDOB
				+ ", applicantGender=" + applicantGender + ", emailId="
				+ emailId + ", aadharCardNo=" + aadharCardNo + ", panCardNo="
				+ panCardNo + ", mobileNo=" + mobileNo + ", flatNo=" + flatNo
				+ ", street=" + street + ", city=" + city + ", state=" + state
				+ ", pin=" + pin + "]";
	}
	public Application(int applicantID, String applicantName,
			String applicantDOB, String applicantGender, String emailId,
			long aadharCardNo, long panCardNo, long mobileNo, long flatNo,
			String street, String city, String state, int pin) {
		super();
		ApplicantID = applicantID;
		this.applicantName = applicantName;
		this.applicantDOB = applicantDOB;
		this.applicantGender = applicantGender;
		this.emailId = emailId;
		this.aadharCardNo = aadharCardNo;
		this.panCardNo = panCardNo;
		this.mobileNo = mobileNo;
		this.flatNo = flatNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	public int getApplicantID() {
		return ApplicantID;
	}
	public void setApplicantID(int applicantID) {
		ApplicantID = applicantID;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantDOB() {
		return applicantDOB;
	}
	public void setApplicantDOB(String applicantDOB) {
		this.applicantDOB = applicantDOB;
	}
	public String getApplicantGender() {
		return applicantGender;
	}
	public void setApplicantGender(String applicantGender) {
		this.applicantGender = applicantGender;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getAadharCardNo() {
		return aadharCardNo;
	}
	public void setAadharCardNo(long aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}
	public long getPanCardNo() {
		return panCardNo;
	}
	public void setPanCardNo(long panCardNo) {
		this.panCardNo = panCardNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public long getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(long flatNo) {
		this.flatNo = flatNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
