package com.demo.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Associate_Details")
public class Associate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="A_Id")
	private int associateId;
	@Column(name = "Associate_Name",length = 4,nullable = true,unique = true)
	private String name;
	@Column(name="Associate_Email")
	private String email;
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
