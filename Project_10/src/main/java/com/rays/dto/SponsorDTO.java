package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;
@Entity
@Table(name = "ST_SPONSOR")
public class SponsorDTO extends BaseDTO {
	
	
	@Column(name = "sponsorName", length = 50)
	private String sponsorName;
	
	@Column(name = "contribution", length = 50)
	private Double contribution;
	
	@Column(name = "contactPerson", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return "sponsorName";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "sponsorName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return "sponsorName";
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "sponsorName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("sponsorName", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("sponsorName", sponsorName);
		return map;
	}

}
