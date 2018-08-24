package com.model.pojo;

public class AccountDeletion {
	int accountDeletionRequestId;
	long accountNumber;
	int customerId;
	public int getAccountDeletionRequestId() {
		return accountDeletionRequestId;
	}
	public void setAccountDeletionRequestId(int accountDeletionRequestId) {
		this.accountDeletionRequestId = accountDeletionRequestId;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "AccountDeletion [accountDeletionRequestId="
				+ accountDeletionRequestId + ", accountNumber=" + accountNumber
				+ ", customerId=" + customerId + "]";
	}
	public AccountDeletion(int accountDeletionRequestId, long accountNumber,
			int customerId) {
		super();
		this.accountDeletionRequestId = accountDeletionRequestId;
		this.accountNumber = accountNumber;
		this.customerId = customerId;
	}
}
