package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.StateDTO;

public class StateForm extends BaseForm {
	
	
	@NotEmpty(message = "please enter stateCode")
	private String stateCode;
	
	@NotEmpty(message = "please enter stateName")
	private String stateName;
	
	@NotEmpty(message = "please enter countryName")
	private String countryName;
	
	@NotEmpty(message = "please enter status")
	private String status;

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public BaseDTO getDto() {
	StateDTO dto = initDTO(new StateDTO());
	dto.setStateCode(stateCode);
	dto.setStateName(stateName);
	dto.setCountryName(countryName);
	dto.setStatus(status);
	
	
		return dto;
	}
	

}
