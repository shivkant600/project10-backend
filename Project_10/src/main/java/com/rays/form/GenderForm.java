package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.GenderDTO;

public class GenderForm extends BaseForm {

	@NotEmpty(message = "please enter genderCode")
	private String genderCode;

	@NotEmpty(message = "please enter genderType")
	private String genderType;

	@NotEmpty(message = "please enter description")
	private String description;

	@NotEmpty(message = "please enter status")
	private String status;

	public String getGenderCode() {
		return genderCode;
	}

	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}

	public String getGenderType() {
		return genderType;
	}

	public void setGenderType(String genderType) {
		this.genderType = genderType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		GenderDTO dto = initDTO(new GenderDTO());
		dto.setGenderCode(genderCode);
		dto.setGenderType(genderType);
		dto.setDescription(description);
		dto.setStatus(status);
		return dto;
	}

}
