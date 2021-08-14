package com.revature.model;

public class Customer {
	private int cId;
	private String cName;
	
	public Customer(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	 
}
