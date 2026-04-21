package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MaskingDTO;

public class MaskingForm extends BaseForm{
	
	@NotEmpty(message = "please enter maskCode")
	private String maskCode;
	
	@NotEmpty(message = "please enter fieldName")
	private String fieldName;
	
	@NotEmpty(message = "please enter maskType")
	private String maskType;
	
	@NotEmpty(message = "please enter status")
	private String status;


	public String getMaskCode() {
		return maskCode;
	}


	public void setMaskCode(String maskCode) {
		this.maskCode = maskCode;
	}


	public String getFieldName() {
		return fieldName;
	}


	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}


	public String getMaskType() {
		return maskType;
	}


	public void setMaskType(String maskType) {
		this.maskType = maskType;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
   
	@Override
	public BaseDTO getDto() {
		MaskingDTO dto = initDTO(new MaskingDTO());
		dto.setMaskCode(maskCode);
		dto.setFieldName(fieldName);
		dto.setMaskType(maskType);
		dto.setStatus(status);
		return  dto;
	}
	
	
	
}
