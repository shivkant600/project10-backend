package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PlanDTO;

public class PlanForm  extends BaseForm{
	
	
	@NotEmpty(message = "please enter planCode")
	private String planCode;
	
	@NotEmpty(message = "please enter planName")
	private String planName;
	
	@NotEmpty(message = "please enter price")
	private String price;
	
	@NotEmpty(message = "please enter status")
	private String status;

	public String getPlanCode() {
		return planCode;
	}

	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public BaseDTO getDto() {
		PlanDTO dto = initDTO(new PlanDTO());
		
		dto.setPlanCode(planCode);
		dto.setPlanName(planName);
		dto.setPrice(price);
		dto.setStatus(status);
		return dto;
	}

}
