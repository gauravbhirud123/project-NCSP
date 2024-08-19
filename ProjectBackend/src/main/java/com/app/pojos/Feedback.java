package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Feedback_tbl")
public class Feedback extends BaseEntity {
  
	@Column(length = 20,unique=true)
	private String firstName;
	
	@Column(length = 20)
	private String CompanyName;
	
	
	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}


	@Column(length =100)
	private String comment;
	

	public Feedback() {
		super();
	}

	@Override
	public String toString() {
		return "Feedback [firstName=" + firstName + ", CompanyName=" + CompanyName + ", comment=" + comment + "]";
	}

	public Feedback(String firstName, String companyName, String comment) {
		super();
		this.firstName = firstName;
		CompanyName = companyName;
		this.comment = comment;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	
	
	
	
}
