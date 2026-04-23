package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.FeatureDTO;

public class FeatureForm extends BaseForm {
	
	@NotEmpty(message = "please enter accessCode")
	private String accessCode;
	
	@NotEmpty(message = "please enter featureName")
	private String featureName;
	
	@NotEmpty(message = "please enter userName")
	private String userName;
	
	@NotEmpty(message = "please enter status")
	private String status;

	public String getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
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
		FeatureDTO dto = initDTO(new FeatureDTO());
		dto.setAccessCode(accessCode);
		dto.setFeatureName(featureName);
		dto.setUserName(userName);
		dto.setStatus(status);
		return dto;
	}

}
