package com.employee.model;

public class Employee {
	private String empname;
	private int empage;
	private String empcity;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empname, int empage, String empcity) {
		super();
		this.empname = empname;
		this.empage = empage;
		this.empcity = empcity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empage;
		result = prime * result + ((empcity == null) ? 0 : empcity.hashCode());
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
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
		Employee other = (Employee) obj;
		if (empage != other.empage)
			return false;
		if (empcity == null) {
			if (other.empcity != null)
				return false;
		} else if (!empcity.equals(other.empcity))
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		return true;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

	public String getEmpcity() {
		return empcity;
	}

	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empage=" + empage + ", empcity=" + empcity + "]";
	}

	
}
