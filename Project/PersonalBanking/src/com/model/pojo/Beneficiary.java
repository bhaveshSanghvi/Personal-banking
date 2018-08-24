package com.model.pojo;

public class Beneficiary {
	int customerID;
	long bAccountNo;
	String bName;
	String bBankName;
	String bBankIfsc;
	
	public Beneficiary(){}
	
	public Beneficiary(long bAccountNo, String bName,
			String bBankName, String bBankIfsc,int customerID) {
		super();
		this.customerID = customerID;
		this.bAccountNo = bAccountNo;
		this.bName = bName;
		this.bBankName = bBankName;
		this.bBankIfsc = bBankIfsc;
	}

	@Override
	public String toString() {
		return "Beneficiary [customerID=" + customerID + ", bAccountNo="
				+ bAccountNo + ", bName=" + bName + ", bBankName=" + bBankName
				+ ", bBankIfsc=" + bBankIfsc + "]";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public long getbAccountNo() {
		return bAccountNo;
	}

	public void setbAccountNo(long bAccountNo) {
		this.bAccountNo = bAccountNo;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbBankName() {
		return bBankName;
	}

	public void setbBankName(String bBankName) {
		this.bBankName = bBankName;
	}

	public String getbBankIfsc() {
		return bBankIfsc;
	}

	public void setbBankIfsc(String bBankIfsc) {
		this.bBankIfsc = bBankIfsc;
	}
	
	
	
}
