package com.rays.form;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;

import com.rays.dto.PolicyDTO;

public class PolicyForm extends BaseForm {
	
	
	@NotEmpty(message = "please enter policyName")
	
	private String policyName;
	
	@NotEmpty(message = "please enter amount")
	
	private String amount;
	
	@NotNull(message = "please enter startDate ")
	private Date startDate;

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	
	@Override
	public BaseDTO getDto() {
	 PolicyDTO dto = initDTO(new PolicyDTO());
	 dto.setPolicyName(policyName);
	 dto.setAmount(amount);
	 dto.setStartDate(startDate);
		
		
		return dto;
	}

}
