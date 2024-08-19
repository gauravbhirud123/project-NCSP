package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Company_tbl")
public class Company extends BaseEntity  {
	
	
	@Column(length = 20)
	private String companyName;
	@Column(length = 20)
	private String companyStatus;
	@Column(length = 40)
	private String companyMission;
	@Column(length = 40)
	private String email;
	@Column(length = 40)
	private String password;

	public Company() {
		super();
	}

	public Company(String companyName, String companyStatus, String companyMission, String email, String password) {
		super();
		this.companyName = companyName;
		this.companyStatus = companyStatus;
		this.companyMission = companyMission;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyStatus=" + companyStatus + ", companyMission="
				+ companyMission + ", email=" + email + ", password=" + password + "]";
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyStatus() {
		return companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public String getCompanyMission() {
		return companyMission;
	}

	public void setCompanyMission(String companyMission) {
		this.companyMission = companyMission;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

	
	

	
	
}
