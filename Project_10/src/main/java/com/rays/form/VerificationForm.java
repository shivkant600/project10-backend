package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.VerificationDTO;

public class VerificationForm extends BaseForm{
	
	@NotEmpty(message = "please enter code")
	private String code;
	
	@NotEmpty(message = "please enter userName")
	private String userName;
	
	@NotEmpty(message = "please enter type")
	private String type;
	
	@NotEmpty(message = "please enter status")
	private String status;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {
		VerificationDTO dto = initDTO(new VerificationDTO());
		dto.setCode(code);
		dto.setUserName(userName);
		dto.setType(type);
		dto.setStatus(status);
		return dto;
	}

}
