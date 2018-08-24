package com.model.pojo;

public class Transaction {
	int transactionId;
	long fromAccountNo;
	long toAccountNo;
	String fromBank;
    String toBank;
	double amount;
	String datetime;
	public Transaction(int transactionId, long fromAccountNo, long toAccountNo,
			String fromBank, String toBank, double amount, String datetime) {
		super();
		this.transactionId = transactionId;
		this.fromAccountNo = fromAccountNo;
		this.toAccountNo = toAccountNo;
		this.fromBank = fromBank;
		this.toBank = toBank;
		this.amount = amount;
		this.datetime = datetime;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public long getFromAccountNo() {
		return fromAccountNo;
	}
	public void setFromAccountNo(long fromAccountNo) {
		this.fromAccountNo = fromAccountNo;
	}
	public long getToAccountNo() {
		return toAccountNo;
	}
	public void setToAccountNo(long toAccountNo) {
		this.toAccountNo = toAccountNo;
	}
	public String getFromBank() {
		return fromBank;
	}
	public void setFromBank(String fromBank) {
		this.fromBank = fromBank;
	}
	public String getToBank() {
		return toBank;
	}
	public void setToBank(String toBank) {
		this.toBank = toBank;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId
				+ ", fromAccountNo=" + fromAccountNo + ", toAccountNo="
				+ toAccountNo + ", fromBank=" + fromBank + ", toBank=" + toBank
				+ ", amount=" + amount + ", datetime=" + datetime + "]";
	}
	
}
