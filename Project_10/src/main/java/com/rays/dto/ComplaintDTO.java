package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_COMPLAINT")
public class ComplaintDTO extends BaseDTO {
	
	@Column(name = "issueType", length = 50)
	private String issueType;
	
	@Column(name = "createdDate", length = 50)
	private Date createdDate;
	
	@Column(name = "status", length = 50)
	private String status;

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "issueType";
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "issueType";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return issueType;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "issueType";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("issueType", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("issueType", issueType);
		return map;
	}
	

}
