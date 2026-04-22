package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.AccessDTO;

public class AccessForm extends BaseForm{
	
	@NotEmpty(message = "please enter accessLogCode")
	private String accessLogCode;
	
	@NotEmpty(message = "please enter userName")
	private String userName;
	
	@NotEmpty(message = "please enter status")
	private String status;


	public String getAccessLogCode() {
		return accessLogCode;
	}


	public void setAccessLogCode(String accessLogCode) {
		this.accessLogCode = accessLogCode;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	
	@Override
	public BaseDTO getDto() {
	AccessDTO dto = initDTO(new AccessDTO());
	dto.setAccessLogCode(accessLogCode);
	dto.setUserName(userName);
	dto.setStatus(status);
	
		return dto;
	}
}
