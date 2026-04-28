package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PasswordDTO;

public class PasswordForm extends BaseForm {
	
	@NotEmpty(message = "please enter restCode")
	private String restCode;
	
	@NotEmpty(message = "please enter userName")
	private String userName;
	
	@NotEmpty(message = "please enter resetToken")
	private String resetToken;
	
	@NotEmpty(message = "please enter status")
	private String status;

	public String getRestCode() {
		return restCode;
	}

	public void setRestCode(String restCode) {
		this.restCode = restCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getResetToken() {
		return resetToken;
	}

	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public BaseDTO getDto() {
		PasswordDTO dto = initDTO(new PasswordDTO());
	
		dto.setRestCode(restCode);
		dto.setResetToken(resetToken);
		dto.setUserName(userName);
		dto.setStatus(status);
		return dto;
	}

}
