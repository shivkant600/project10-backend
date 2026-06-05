package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.InsuranceDTO;

public class InsuranceForm extends BaseForm {

	@NotEmpty(message = "please enter customerCode")
	private String customerCode;

	@NotEmpty(message = "please enter customerName")
	private String customerName;

	@NotEmpty(message = "please enter policyType")
	private String policyType;

	@NotNull(message = "please enter amount ")
	private Double amount;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public BaseDTO getDto() {
		InsuranceDTO dto = initDTO(new InsuranceDTO());
		dto.setCustomerCode(customerCode);
		dto.setCustomerName(customerName);
		dto.setPolicyType(policyType);
		dto.setAmount(amount);
		dto.setStatus(status);
		return dto;
	}
}
