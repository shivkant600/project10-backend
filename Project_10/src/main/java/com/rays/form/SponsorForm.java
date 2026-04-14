package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SponsorDTO;

public class SponsorForm extends BaseForm {
	
	
	@NotEmpty(message = "please enter sponsorName")
	private String sponsorName;
	
	@NotNull(message = "please enter contribution ")
	private Double contribution;
	
	@NotEmpty(message = "please enter contactPerson")
	private String contactPerson;


	public String getSponsorName() {
		return sponsorName;
	}


	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}


	public Double getContribution() {
		return contribution;
	}


	public void setContribution(Double contribution) {
		this.contribution = contribution;
	}


	public String getContactPerson() {
		return contactPerson;
	}


	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	
	
	@Override
	public BaseDTO getDto() {
		SponsorDTO dto = initDTO(new SponsorDTO());
		dto.setSponsorName(sponsorName);
		dto.setContribution(contribution);
		dto.setContactPerson(contactPerson);
		return dto;
	}

}
