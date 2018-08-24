package com.model.pojo;

public class Account {
	long accountNo;
	int customerId;
	double balance;
	String type;
	String bankIfsc;
	String status;
	public Account(long accountNo, int customerId, double balance, String type,
			String bankIfsc, String status) {
		super();
		this.accountNo = accountNo;
		this.customerId = customerId;
		this.balance = balance;
		this.type = type;
		this.bankIfsc = bankIfsc;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", customerId=" + customerId
				+ ", balance=" + balance + ", type=" + type + ", bankIfsc="
				+ bankIfsc + ", status=" + status + "]";
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBankIfsc() {
		return bankIfsc;
	}
	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
