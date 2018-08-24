package com.model.pojo;

public class DebitCardApplication {
	int debitCardRequestId;
	long accountNumber;
	public DebitCardApplication(int debitCardRequestId, long accountNumber) {
		super();
		this.debitCardRequestId = debitCardRequestId;
		this.accountNumber = accountNumber;
	}
	public int getDebitCardRequestId() {
		return debitCardRequestId;
	}
	public void setDebitCardRequestId(int debitCardRequestId) {
		this.debitCardRequestId = debitCardRequestId;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "DebitCardApplication [debitCardRequestId=" + debitCardRequestId
				+ ", accountNumber=" + accountNumber + "]";
	}
}
