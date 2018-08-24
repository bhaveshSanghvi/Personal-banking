package com.model.pojo;

public class Bank {
	String bankName;
	String NoOfBranches;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getNoOfBranches() {
		return NoOfBranches;
	}
	public void setNoOfBranches(String noOfBranches) {
		NoOfBranches = noOfBranches;
	}
	public Bank(String bankName, String noOfBranches) {
		super();
		this.bankName = bankName;
		NoOfBranches = noOfBranches;
	}
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", NoOfBranches=" + NoOfBranches
				+ "]";
	}
}
