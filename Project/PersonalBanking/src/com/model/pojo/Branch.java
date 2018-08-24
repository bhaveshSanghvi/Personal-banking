package com.model.pojo;

public class Branch {
	String ifscCode;
	String location;
	String bankname;
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	@Override
	public String toString() {
		return "Branch [ifscCode=" + ifscCode + ", location=" + location
				+ ", bankname=" + bankname + "]";
	}
	public Branch(String ifscCode, String location, String bankname) {
		super();
		this.ifscCode = ifscCode;
		this.location = location;
		this.bankname = bankname;
	}
}
