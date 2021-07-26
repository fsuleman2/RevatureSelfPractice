package com.employee.model;

public class Customer {
private String custName;
private int custAge;
public Customer() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer [custName=" + custName + ", custAge=" + custAge + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + custAge;
	result = prime * result + ((custName == null) ? 0 : custName.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (custAge != other.custAge)
		return false;
	if (custName == null) {
		if (other.custName != null)
			return false;
	} else if (!custName.equals(other.custName))
		return false;
	return true;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public int getCustAge() {
	return custAge;
}
public void setCustAge(int custAge) {
	this.custAge = custAge;
}
public Customer(String custName, int custAge) {
	super();
	this.custName = custName;
	this.custAge = custAge;
}
}
