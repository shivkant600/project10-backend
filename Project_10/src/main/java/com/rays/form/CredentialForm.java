package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CredentialDTO;

public class CredentialForm extends BaseForm {
	

	@NotEmpty(message = "please enter credentialCode")
	private String credentialCode;
	

	@NotEmpty(message = "please enter userName")
	private String userName;
	

	@NotEmpty(message = "please enter type")
	private String type;
	
	

	@NotEmpty(message = "please enter status")
	private String status;


	public String getCredentialCode() {
		return credentialCode;
	}


	public void setCredentialCode(String credentialCode) {
		this.credentialCode = credentialCode;
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
		CredentialDTO dto = initDTO(new CredentialDTO());
		dto.setCredentialCode(credentialCode);
		dto.setUserName(userName);
		dto.setType(type);
		dto.setStatus(status);
		return dto;
	}
	
	

}
