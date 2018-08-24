package com.model.pojo;

public class AccountCreationRequest {
	int accountCreationRequestId;
	int customerId;
	public int getAccountCreationRequestId() {
		return accountCreationRequestId;
	}
	public void setAccountCreationRequestId(int accountCreationRequestId) {
		this.accountCreationRequestId = accountCreationRequestId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "AccountCreationRequest [accountCreationRequestId="
				+ accountCreationRequestId + ", customerId=" + customerId + "]";
	}
	public AccountCreationRequest(int accountCreationRequestId, int customerId) {
		super();
		this.accountCreationRequestId = accountCreationRequestId;
		this.customerId = customerId;
	}
}
