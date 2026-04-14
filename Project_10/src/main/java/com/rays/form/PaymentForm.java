package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PaymentDTO;

public class PaymentForm extends BaseForm {

	@NotEmpty(message = "please enter methodCode")
	private String methodCode;
	
	@NotEmpty(message = "please enter methodName")
	private String methodName;
	
	@NotEmpty(message = "please enter provider")
	private String provider;
	
	@NotEmpty(message = "please enter status")
	private String status;

	public String getMethodCode() {
		return methodCode;
	}

	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public BaseDTO getDto() {
	PaymentDTO dto = initDTO(new PaymentDTO());
	dto.setMethodCode(methodCode);
	dto.setMethodName(methodName);
	dto.setProvider(provider);
	dto.setStatus(status);
	
		return dto;
	}
}
