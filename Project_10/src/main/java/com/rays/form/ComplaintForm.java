package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ComplaintDTO;

public class ComplaintForm extends BaseForm{
	
	
	
	@NotEmpty(message = "please enter issueType")
	private String issueType;
	
	
	@NotNull(message = "please enter createdDate ")
	private Date createdDate;
	
	
	@NotEmpty(message = "please enter status")
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
	public BaseDTO getDto() {
		ComplaintDTO dto = initDTO(new ComplaintDTO());
		dto.setIssueType(issueType);
		dto.setCreatedDate(createdDate);
		dto.setStatus(status);
		return dto;
	}

}
