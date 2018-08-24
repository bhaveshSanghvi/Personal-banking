package com.model.pojo;

public class Address {
	int customerId;
	String flatNo;
	String street;
	String city;
	String state;
	String pin;
	public Address(){}
	public Address(int customerId, String flatNo, String street, String city,
			String state, String pin) {
		super();
		this.customerId = customerId;
		this.flatNo = flatNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
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
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [customerId=" + customerId + ", flatNo=" + flatNo
				+ ", street=" + street + ", city=" + city + ", state=" + state
				+ ", pin=" + pin + "]";
	}
}
