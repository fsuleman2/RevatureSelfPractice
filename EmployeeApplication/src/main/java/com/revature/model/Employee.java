package com.revature.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int eId;
	private String eName;
	private int eSalary;
	private String eDepartment;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eId, String eName, int eSalary, String eDepartment) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eDepartment = eDepartment;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteSalary() {
		return eSalary;
	}

	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}

	public String geteDepartment() {
		return eDepartment;
	}

	public void seteDepartment(String eDepartment) {
		this.eDepartment = eDepartment;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", eDepartment=" + eDepartment
				+ "]";
	}
	
	
}
