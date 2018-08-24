package com.model.pojo;

public class DebitCard {
	long debitCardNumber;
	String expiryDate;
	int cvvNO;
	long accountNumber;
	String debitCardType;
	@Override
	public String toString() {
		return "DebitCard [debitCardNumber=" + debitCardNumber
				+ ", expiryDate=" + expiryDate + ", cvvNO=" + cvvNO
				+ ", accountNumber=" + accountNumber + ", debitCardType="
				+ debitCardType + "]";
	}
	public DebitCard(long debitCardNumber, String expiryDate, int cvvNO,
			long accountNumber, String debitCardType) {
		super();
		this.debitCardNumber = debitCardNumber;
		this.expiryDate = expiryDate;
		this.cvvNO = cvvNO;
		this.accountNumber = accountNumber;
		this.debitCardType = debitCardType;
	}
	public long getDebitCardNumber() {
		return debitCardNumber;
	}
	public void setDebitCardNumber(long debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getCvvNO() {
		return cvvNO;
	}
	public void setCvvNO(int cvvNO) {
		this.cvvNO = cvvNO;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getDebitCardType() {
		return debitCardType;
	}
	public void setDebitCardType(String debitCardType) {
		this.debitCardType = debitCardType;
	}
}
